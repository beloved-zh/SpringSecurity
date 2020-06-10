package com.zh.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {


    //@Secured({"ROLE_ADMIN","ROLE_PRODUCT"})
    //@RolesAllowed({"ROLE_ADMIN","ROLE_PRODUCT"})
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_PRODUCT')")
    @RequestMapping("/findAll")
    public String findAll(){
        return "product-list";
    }
}
