package me.simplebit.configdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Randy Damron
 * randy.damron@gmail.com
 * 3/19/16
 * ConfigDemo
 **/

@RefreshScope
@Component
public class MyProp {
    @Value("${name}")
    String name;

    public String getName(){
        return name;
    }
}
