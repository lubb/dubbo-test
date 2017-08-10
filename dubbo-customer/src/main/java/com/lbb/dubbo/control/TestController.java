package com.lbb.dubbo.control;

import com.lbb.dubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/testDubbo")
    @ResponseBody
    public String sayDubbo(){
        String str = testService.testSayDubbo();
        return str;
    }

    @RequestMapping("/testSay")
    @ResponseBody
    public String sayHello(String name){
        String str = testService.say(name);
        return str;
    }
}
