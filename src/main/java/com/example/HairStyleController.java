package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HairStyleController {

    @Autowired
    private HairStyleRepo hairStyleRepo;

    @RequestMapping("/")
    public Iterable<HairStyle> helloSlickBack(){
        HairStyle hairStyle = new HairStyle();
        hairStyle.setName("Slick Back Willy");
        hairStyle = hairStyleRepo.save(hairStyle);
        return hairStyleRepo.findAll();
    }
}
