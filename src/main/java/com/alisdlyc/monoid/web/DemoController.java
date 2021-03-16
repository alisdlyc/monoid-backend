package com.alisdlyc.monoid.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/now")
    public String now() {return "hello";};
}
