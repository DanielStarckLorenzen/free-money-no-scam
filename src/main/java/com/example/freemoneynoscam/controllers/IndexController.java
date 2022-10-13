package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {

    private ValidateEmailService val = new ValidateEmailService();

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm){
        System.out.println(dataFromForm.getParameter("email"));
        val.create(dataFromForm);
        return "redirect:/succes";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }
}
