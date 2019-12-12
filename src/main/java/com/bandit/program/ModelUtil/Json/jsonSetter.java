package com.bandit.program.ModelUtil.Json;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.junit.Before;
import org.junit.Test;

public class jsonSetter {

    private String productName;
    private String desc;
    private String price;

    @JSONField(name="name")
    public String getProductName() {
        return productName;
    }

    @JSONField(name="NAME")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JSONField(name="desc")
    public String getDesc() {
        return desc;
    }

    @JSONField(name="DESC")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JSONField(name="price")
    public String getPrice() {
        return price;
    }

    @JSONField(name="PRICE")
    public void setPrice(String price) {
        this.price = price;
    }

    public String toString() {
        return JSONObject.toJSONString(this);
    }

    private jsonSetter Product;

    @Before
    public void setup() {
        Product = new jsonSetter();
        Product.setDesc("hehs is just for test");
        Product.setProductName("test product");
        Product.setPrice("9887777777");
    }

    @Test
    public void test() {
//        jsonSetter Product = new jsonSetter();
//        Product.setPrice("122333");
//        Product.setProductName("test product");
//        Product.setDesc("thehs is just for test");

        String jsonStr = JSONObject.toJSONString(Product);
        System.out.println("+++++++++"+jsonStr);

        jsonStr = jsonStr.toUpperCase();
        System.out.println("*********"+jsonStr);

        Product = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), jsonSetter.class);
        System.out.println("Finale res"+ Product.getDesc());
    }
}