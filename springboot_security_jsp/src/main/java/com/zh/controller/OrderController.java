package com.zh.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    //@Secured({"ROLE_ADMIN","ROLE_ORDER"})  // SpringSecurity内部制定注解
    //@RolesAllowed({"ROLE_ADMIN","ROLE_ORDER"})  // jsr250注解
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_ORDER')")  //Spring的el表达式注解
    @RequestMapping("/findAll")
    public String findAll(){
        return "order-list";
    }
}
