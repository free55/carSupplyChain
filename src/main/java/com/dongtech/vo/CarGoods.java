package com.dongtech.vo;

import java.math.BigDecimal;

/**
 * @author gzl
 * @date 2020-04-15
 * @program: springboot-jsp
 * @description: ${description}
 */
public class CarGoods {
    private Long id;//编号
    private String number;//编号
    private String name;//名称
    private String produce;//出厂地址
    private BigDecimal price;//单价
    private String type;//类别
    private String description;//书本详情
    private Integer num;//库存数

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CarGoods() {
    }

    public CarGoods(Long id, String number, String name, String produce, BigDecimal price, String type, String description, Integer num) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.produce = produce;
        this.price = price;
        this.type = type;
        this.num = num;
        this.description = description;
    }
}
