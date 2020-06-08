package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*申明让spring boot自动给程序进行必要的配置，这个配置等同于：@Configuration，@EnableAutoConfiguration
和 @ComponentScan 三个配置*/
@SpringBootApplication
/*用于定义控制器类，在spring项目中由控制器负责将用户发来的URL请求转发到对应的服务接口（service层），
一般这个注解在类中，通常方法需要配合注解@RequestMapping。*/
@Controller
/*@MapperScan("com.example.demo.dao.mapper")*/
public class DemoApplication {

    @GetMapping("/")
    /*表示该方法的返回结果直接写入HTTP response body中，一般在异步获取数据时使用，用于构建RESTful的api。
    在使用@RequestMapping后，返回值通常解析为跳转路径，加上@esponsebody后返回结果不会被解析为跳转路径，
    而是直接写入HTTP response body中。比如异步获取json数据，加上@Responsebody后，会直接返回json数据。
    该注解一般会配合@RequestMapping一起使用。*/
    @ResponseBody
    public String index(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
