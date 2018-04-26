package org.footprint.demo.controller;

import org.footprint.core.annotation.LogUnit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@LogUnit("简单controller")
public class SampleController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
