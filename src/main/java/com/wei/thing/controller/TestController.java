package com.wei.thing.controller;
import com.google.gson.Gson;
import com.wei.thing.bean.Temperature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/")
public class TestController {

    @GetMapping("/test")
    public String test(Model model){


        List<Temperature> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            Temperature temperature = new Temperature();
            temperature.setDate(new Date());
            temperature.setTemperature(2*i);
            list.add(temperature);
        }
        Gson gson =new Gson();
        String jsonObject = gson.toJson(list); // {"name":"张三kidou","age":24}
        model.addAttribute("list",jsonObject);

        return "test";

    }
}
