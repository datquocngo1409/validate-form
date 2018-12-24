package com.codegym.form.controller;

import com.codegym.form.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    @GetMapping("/user")
    public ModelAndView input(){
        ModelAndView modelAndView = new ModelAndView("/user/form");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/user")
    public ModelAndView output(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("/user/form");
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView("/user/result");
            return modelAndView;
        }
    }
}
