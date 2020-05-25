package com.dongtech.vo;

import java.math.BigDecimal;

/**
 * @author gzl
 * @date 2020-04-15
 * @program: springboot-jsp
 * @description: ${description}
 */
public class TearDownDetails {
    private Long id;
    private Integer orderId;
    private String produce;
    private String cargoods_name;
    private Integer num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public String getCargoods_name() {
        return cargoods_name;
    }

    public void setCargoods_name(String cargoods_name) {
        this.cargoods_name = cargoods_name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public TearDownDetails() {
    }

    public TearDownDetails(Long id, Integer orderId, String produce, String cargoods_name, Integer num) {
        this.id = id;
        this.orderId = orderId;
        this.produce = produce;
        this.cargoods_name = cargoods_name;
        this.num = num;
    }
}
