package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestConsul02
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/1
 * @Version V1.0
 **/
@SpringBootApplication
@RestController
public class TestConsul02 {
    public static void main(String[] args){

        SpringApplication.run(TestConsul02.class,args);

    }

    @RequestMapping("/testHelth")
    public String testHelth(){
        System.out.println("-------------testHelth-----------------");
        return "ok-^_^";
    }
}
