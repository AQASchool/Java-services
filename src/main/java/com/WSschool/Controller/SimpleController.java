package com.WSschool.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oleksiich on 10/26/2015.
 */
@RestController
public class SimpleController {

    @RequestMapping(method=RequestMethod.GET, name = "/test")
    public String test(@RequestParam(name = "id",required = true ) Integer id)
    {
        if(id<100){
           return "hello " + id;
    }
        return "none";
    }

}
