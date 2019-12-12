package com.bandit.program.ModelUtil.Json;

import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.Test;

// 新建测试类
public class jsonTest {

    private jsonField person;

    // 初始化对象
    @Before
    public void setUp() {
        person = new jsonField();
        person.setName("xianglj");
        person.setAge("20");
        person.setDesc("只是一个测试");
    }

    @Test
    public void test() {
        String jsonStr = JSONObject.toJSONString(person);
        System.out.println("testBean to json:" + jsonStr);

        //改变json的key及 value 均转为大写
        jsonStr = jsonStr.toUpperCase();

        System.out.println("需要转换的json:" + jsonStr);
        person = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), jsonField.class);
        System.out.println("json to testBean:" + person.getName());

    }
}

