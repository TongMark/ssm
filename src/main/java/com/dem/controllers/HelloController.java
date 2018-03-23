package com.dem.controllers;

import com.dem.dto.Girl;
import com.dem.service.IDemService;
import com.system.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *
 * @author TFR
 * @date 2018/3/13
 */
@Controller
public class HelloController {

    @Autowired
    private IDemService demService;

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/")
    public String index(){
        logger.info("index.html");
        return "index";
    }

    @RequestMapping(value = "/home")
    public ModelAndView hello(){
        logger.info("home.html");
        String name = "111";
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name",name);
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping(value = "/test/girl",method = RequestMethod.GET)
    public ModelAndView test(){
        List<Girl> girls = demService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",ResultUtil.success(girls));
        modelAndView.setViewName("/girl/girl");
        return modelAndView;
    }

    @RequestMapping(value = "/test/girl2",method = RequestMethod.GET)
    @ResponseBody
    public List<Girl> test2(){
        List<Girl> girls = demService.queryAll();
        return girls;
    }
}
