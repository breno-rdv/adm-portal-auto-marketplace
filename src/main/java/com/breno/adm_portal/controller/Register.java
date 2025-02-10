package com.breno.adm_portal.controller;

import com.breno.adm_portal.service.RegisterCar;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Register {

    private final RegisterCar service;

    public Register(RegisterCar service) {
        this.service = service;
    }

    @PostMapping("register")
    public ResponseEntity register() {
        service.register();
        return ResponseEntity.ok().build();
    }
}
