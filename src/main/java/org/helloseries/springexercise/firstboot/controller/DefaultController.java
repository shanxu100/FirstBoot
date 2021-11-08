package org.helloseries.springexercise.firstboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
@ResponseBody
public class DefaultController {

    @GetMapping()
    public String handleDefaultByGet(HttpServletRequest request, HttpServletResponse response){

        return "Hello boys. This is default Msg from GET: params is";
    }

    @PostMapping()
    public String handleDefaultByPost(){
        return "Hello boys. This is default Msg from POST";
    }
}
