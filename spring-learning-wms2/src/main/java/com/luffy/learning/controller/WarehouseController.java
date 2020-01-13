package com.luffy.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/warehouse")
@RestController
public class WarehouseController {

    @GetMapping
    public String warehouse() {

        return "wms2--------> Warehouse_US";
    }

}
