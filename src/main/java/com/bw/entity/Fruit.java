package com.bw.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Fruit implements Serializable {

	private Integer id;
	private int apple;
	private int pear;
	private int orange;
	private int banana;
	private String name;
	private String fclass;

    //private Integer student_id;

    //maybatis并没有实现真正的对象关系映射，：maybais在处理表与表之间的关联时 不能自动封装成表对应的对象
	//private Student student;

}
