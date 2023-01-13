package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SimpleController {

    @GetMapping("/hello")
    public @ResponseBody String getResponse()
    {

        return "Hello GeeksForGeeks";
    }


}
