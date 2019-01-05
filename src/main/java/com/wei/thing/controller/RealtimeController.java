package com.wei.thing.controller;

import com.google.gson.Gson;
import com.wei.thing.bean.ThingsBean;
import com.wei.thing.dao.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/realtime")
public class RealtimeController {


    @Autowired
    private Mapper mapper;


    @RequestMapping("/table1")
    public String getRealtimeOfIllumination(){


        List<ThingsBean> list = mapper.getLastListOfAcceleration();


        Gson gson= new Gson();
        String jsonObject = gson.toJson(list);


        return jsonObject;

    }
    @RequestMapping("/table2")
    public String getRealtimeOfAcceleration(){


        List<ThingsBean> list = mapper.getLastListOfLllumination();


        Gson gson= new Gson();
        String jsonObject = gson.toJson(list);


        return jsonObject;

    }

}
