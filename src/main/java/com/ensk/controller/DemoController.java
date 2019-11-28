package com.ensk.controller;

import com.ensk.entity.Product;
import com.ensk.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Ensk!";
    }

    @ResponseBody
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public Product getProduct() {
        return demoService.getProduct();
    }

    @ResponseBody
    @RequestMapping("/product/{type}")
    public Product getProductByType(@PathVariable String type) {
        return demoService.getProductByType(type);
    }

}