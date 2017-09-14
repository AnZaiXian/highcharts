package com.bw.controller;

import com.bw.entity.Fruit;
import com.bw.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lenovo on 2017/7/18.
 */
@Controller
public class HighCharts {
    //创建repositoy的实例
    @Autowired
    private FruitService fruitService;

    /**
     * to highcharts age
     */
    @RequestMapping("index")
    public String toindex(){

        return "index";
    }

    /**
     * 查询每个学生的每种水果的个数
     */
     @RequestMapping("fruit")
     @ResponseBody
     public List<Fruit> selectFruit(){
         System.out.println("======查询每个学生的每种水果的个数==========");
         List<Fruit> all = fruitService.findFruit();
         for (Fruit f: all){
             System.out.println(f);
         }
         return all;
     }


}
