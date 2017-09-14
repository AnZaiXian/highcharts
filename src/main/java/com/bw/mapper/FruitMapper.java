package com.bw.mapper;

import com.bw.entity.Fruit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lenovo on 2017/7/18.
 */
@Mapper
@Component
public interface FruitMapper {

    /**
     * 查询每个学生的每种水果的个数
     *
     */
    @Select("select s.name,s.fclass,f.id,f.apple,f.pear,f.orange,f.banana from student s,fruit f where s.id = f.student_id")
    List<Fruit> findFruit();


}
