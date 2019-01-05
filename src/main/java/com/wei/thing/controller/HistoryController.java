package com.wei.thing.controller;

import com.google.gson.Gson;
import com.wei.thing.bean.ThingsBean;
import com.wei.thing.dao.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private Mapper mapper;


    @RequestMapping("/table1")
    public String getRealtimeOfIllumination(@RequestParam("startTime") String startTime,@RequestParam("endTime") String endTime){


        List<ThingsBean> list = mapper.getAccelerationByTime(startTime,endTime);


        Gson gson= new Gson();
        String jsonObject = gson.toJson(list);


        return jsonObject;

    }
    @RequestMapping("/table2")
    public String getRealtimeOfAcceleration(@RequestParam("startTime") String startTime,@RequestParam("endTime") String endTime){


        List<ThingsBean> list = mapper.getIlluminationByTime(startTime,endTime);


        Gson gson= new Gson();
        String jsonObject = gson.toJson(list);


        return jsonObject;

    }

}
