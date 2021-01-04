package com.codingdojo.secondproject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
    @RequestMapping("")
    public String hello(){
        return ("Hello Coding dojo");
    }
    @RequestMapping("/python")
    public String pyhton(){
        return ("Python/Django was awesome!");
    }
    @RequestMapping("/Spring")
    public String spring(){
        return ("Java/Spring is better!");
    }



}
