package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iBank on 12/29/13.
 */
@Controller
@RequestMapping("/")
public class SimpleController {

    private final static Logger logger = LoggerFactory
            .getLogger(SimpleController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        logger.debug("printWelcome");
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello(ModelMap model){
        logger.debug("sayHello");
        model.addAttribute("username", "Kim");
        return "hello";
    }

    @RequestMapping(value = "temp", method = RequestMethod.GET)
    public String jspRequest(ModelMap model) {
        logger.debug("jspRequest");
        model.addAttribute("what", "Kim Done");
        return "temp";
    }
}
