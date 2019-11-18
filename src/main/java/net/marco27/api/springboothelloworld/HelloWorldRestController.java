package net.marco27.api.springboothelloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldRestController.class);

    @RequestMapping(value = "/hello/rest", method = RequestMethod.GET)
    @Description(value = "Hello REST")
    public String sayHello() {
        final String msg = "Hello Rest!";
        LOGGER.debug(msg);
        return msg;
    }
}
