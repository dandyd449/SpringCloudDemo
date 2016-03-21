package me.simplebit.producer;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Randy Damron
 * randy.damron@gmail.com
 * 3/20/16
 * ProducerDemo
 **/

@RestController
public class Producer {
    final static Logger log = Logger.getLogger(Producer.class);
    int counter = 0;

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    String produce(){
        counter++;
        log.info("The Value is: " + counter);

        return "{\"value\": " + counter + "}";
    }

}
