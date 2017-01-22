package sample.web.ui.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vibodha on 1/22/17.
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello world";
    }
}
