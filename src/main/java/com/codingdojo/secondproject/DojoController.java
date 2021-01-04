package com.codingdojo.secondproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DojoController {
    @RequestMapping("/{name}")
    public String getInfo(@PathVariable("name") String name){
        if (name.equals("dojo")) {
            return ("The dojo is awesome");

        }
        if (name.equals("burbank-dojo")) {
            return ("Burbank Dojo is located in Southern California");
        }
        if (name.equals("san-jose")) {
            return ("SJ dojo is the headquarters");
        }
        else {
            return ("please choose one of these options 1-dojo   2-burbank-dojo     3-san-jose"   );
        }


    }
}
