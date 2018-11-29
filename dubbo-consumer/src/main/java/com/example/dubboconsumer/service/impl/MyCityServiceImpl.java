package com.example.dubboconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboapi.service.CityService;
import com.example.dubboconsumer.service.MyCityService;
import org.springframework.stereotype.Service;

@Service
public class MyCityServiceImpl implements MyCityService {

    @Reference
    public CityService cityService;

    @Override
    public String printCity(String name) {

        String happy = "hello:" + cityService.findCityByName(name);

        return happy;
    }
}
