package com.example.springmvctraining;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String message) {
        return "Hello " + message + "!";
    }
	
//    @RequestMapping(value="/hello/{message}", method=RequestMethod.GET)
//    @ResponseBody
//    public String hello(@PathVariable String message) {
//        return "Hello " + message + "!";
//    }
   
	//JSP
//	@RequestMapping("/hello")
//    public String hello(ModelMap modelMap, @RequestParam String message) {
//        modelMap.addAttribute("message", message);
//        return "hello";
//    }
	
}