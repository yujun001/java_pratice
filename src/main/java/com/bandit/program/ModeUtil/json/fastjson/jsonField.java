package com.bandit.program.ModeUtil.json.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.junit.Before;
import org.junit.Test;

public class jsonField {

    @JSONField(name="name")
    private String name;

    @JSONField(name="age")
    private String age;

    @JSONField(name="desc")
    private String desc;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNAME(String NAME) {
        this.name = NAME;
    }

    public void setAGE(String AGE) {
        this.age = AGE;
    }

    public void setDESC(String DESC) {
        this.desc = DESC;
    }

    public String toString() { return JSONObject.toJSONString(this); }

    // 方法1, 或者
    private jsonField person;

    // 对象初始化
    @Before
    public void setup() {
        person = new jsonField();
        person.setName("For test");
        person.setAge("12333");
        person.setDesc("hhellllll");
    }

    // 测试单元
    @Test
    public void test() {
        String jsonstr = JSONObject.toJSONString(person);
        System.out.println("***********"+ jsonstr);

        //改变json中的key 及字符相关为大写
        jsonstr = jsonstr.toUpperCase();
        System.out.println(jsonstr);

        //字符串改为map结构
        person = JSONObject.toJavaObject(JSONObject.parseObject(jsonstr), jsonField.class);
        System.out.println("^^^^^^^^^^^^"+ person.getName());
    }
}
