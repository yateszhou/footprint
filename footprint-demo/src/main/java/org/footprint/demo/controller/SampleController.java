package org.footprint.demo.controller;

import org.footprint.core.Logger;
import org.footprint.core.LoggerFactory;
import org.footprint.core.annotation.LogUnit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@LogUnit(comment="简单controller", group="简单组")
@RestController
public class SampleController {
	
	private static Logger logger= LoggerFactory.getLogger();
	
	
    @RequestMapping("/")
    String home() {
//    	logger.error("测试");
    	test();
        return "Hello World!";
    }
    
    public void test(){
    	logger.error("test方法");
    }
}
