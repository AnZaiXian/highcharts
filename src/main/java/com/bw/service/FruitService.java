package com.bw.service;

import com.bw.entity.Fruit;

import java.util.List;

/**
 * Created by lenovo on 2017/7/19.
 */
public interface FruitService {

    /**
     * 查询每个用户的水果数量
     */
    List<Fruit> findFruit();



}
