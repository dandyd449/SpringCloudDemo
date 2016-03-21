package me.simplebit.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Randy Damron
 * randy.damron@gmail.com
 * 3/20/16
 * ConsumerDemo
 **/

@Component
@FeignClient(name = "producerdemo")
public interface ProducerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    ProducerResponse getValue();

}
