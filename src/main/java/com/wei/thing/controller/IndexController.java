package com.wei.thing.controller;
import com.google.gson.Gson;
import com.wei.thing.bean.ThingsBean;
import com.wei.thing.dao.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/")
public class IndexController {


    @Autowired
    private Mapper mapper;

    @GetMapping("/index")
    public String index(Model model){


        return "page/index";

    }

    @GetMapping("/history")
    public String history(){


        return "page/history";

    }
}
