package com.luffy.learning.services;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "wms")
public interface IWarehosueFeign {

    @GetMapping("/warehouse")
    String getWarehosue();

}
