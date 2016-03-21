package me.simplebit.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Randy Damron
 * randy.damron@gmail.com
 * 3/20/16
 * ConsumerDemo
 **/

@Component
@RestController
public class ConsumerController {

    @Autowired
    ProducerClient client;

    @RequestMapping("/")
    String consume() {
        ProducerResponse response = client.getValue();

        return "{\"value\": " + response.getValue() + "}";
    }

}
