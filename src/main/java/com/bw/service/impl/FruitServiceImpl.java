package com.bw.service.impl;

import com.bw.entity.Fruit;
import com.bw.mapper.FruitMapper;
import com.bw.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/7/19.
 */
@Service("fruitService")
public class FruitServiceImpl implements FruitService {

    //创建mapper的实例
    @Autowired
    private FruitMapper fruitMapper;

    /**
     * 查询每个用户的水果数量
     */
    @Override
    public List<Fruit> findFruit() {

        List<Fruit> all = fruitMapper.findFruit();

        return all;
    }

}
