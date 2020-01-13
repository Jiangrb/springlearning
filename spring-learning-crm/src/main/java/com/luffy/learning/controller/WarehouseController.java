package com.luffy.learning.controller;

import com.luffy.learning.services.IWarehosueFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
@Slf4j
public class WarehouseController {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IWarehosueFeign warehosueFeign;

    @RequestMapping("api/ribbon/warehouse")
    public String getWarehouseByRibbon() {
        String url = "http://wms/warehouse";

        String warehouse = restTemplate.getForObject(url, String.class);

        log.info("ribbon获取warehouse：{}", warehouse);
        return warehouse;
    }

    @RequestMapping("api/feign/warehouse")
    public String getWarehouseByFeign() {
        String warehouse = warehosueFeign.getWarehosue();
        log.info("feign获取warehouse：{}", warehouse);
        return warehouse;
    }


}
