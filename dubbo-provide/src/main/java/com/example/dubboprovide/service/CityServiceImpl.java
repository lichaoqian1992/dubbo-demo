package com.example.dubboprovide.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboapi.service.CityService;

@Service
public class CityServiceImpl implements CityService {
    @Override
    public String findCityByName(String cityname) {
        return cityname;
    }
}
