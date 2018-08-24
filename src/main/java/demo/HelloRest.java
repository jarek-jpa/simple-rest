package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jarek Pawlak on 8/30/18.
 */
@RestController
public class HelloRest {
    @Value("${instance.name:default-instance}")
    private String instanceName;

    @RequestMapping("/hello")
    public String helloWorld() {
        return "[" + instanceName + "]" + " Hello World!";
    }
}
