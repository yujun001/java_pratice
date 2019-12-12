package com.bandit.program.ModeUtil.json.fastjson;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

/**
 * 对fastjson中的JSON转换做一个测试
 * @author jun_yu
 * main 或 test
 */
public class jsonSetterTest {

    public static void main(String[] args) {
        jsonSetter product = new jsonSetter();
        product.setProductName("产品");
        product.setDesc("这是一个产品");
        product.setPrice("22.3");

        String jsonStr = JSONObject.toJSONString(product);
        System.out.println("转换为json:" + JSONObject.toJSONString(product));

        jsonStr = jsonStr.toUpperCase();
        System.out.println(jsonStr);

        product = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), jsonSetter.class);
        System.out.println(product.toString());
    }

    @Test
    public void test() {
        jsonSetter product = new jsonSetter();
        product.setProductName("产品");
        product.setDesc("这是一个产品");
        product.setPrice("22.3");

        String jsonStr = JSONObject.toJSONString(product);
        System.out.println("转换为json:" + JSONObject.toJSONString(product));

//        jsonStr = jsonStr.toUpperCase();
        System.out.println(jsonStr);

        product = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), jsonSetter.class);
        System.out.println(product.toString());
    }
}
