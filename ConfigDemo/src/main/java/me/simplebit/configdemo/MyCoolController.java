package me.simplebit.configdemo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Randy Damron
 * randy.damron@gmail.com
 * 3/19/16
 * ConfigDemo
 **/

@RestController
public class MyCoolController {
    private static final Logger log = Logger.getLogger(MyCoolController.class);

    @Autowired
    public MyProp myProp;

    @RequestMapping("/")
    public String getValue(){
        log.info( myProp.getName() );
        return "Hello " + myProp.getName();
    }
}

