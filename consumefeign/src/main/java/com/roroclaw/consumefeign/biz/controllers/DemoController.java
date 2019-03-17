package com.roroclaw.consumefeign.biz.controllers;
import com.roroclaw.consumefeign.biz.servers.IDemoService;
import org.omg.CORBA.StringHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHi(){
        return demoService.hello();
    }

//    @Autowired
//    private IDemoService demoService;
// 
//  @GetMapping(value = "/hello")
//  public String sayHi(@RequestParam(value = "name") String name){
//   return helloService.sayHello(name);
//  }
}
