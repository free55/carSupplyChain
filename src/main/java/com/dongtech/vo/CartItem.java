package com.dongtech.vo;

import java.io.Serializable;

/**
 *   购物车项
 *   @author  PF
 */
public class CartItem implements Serializable {
    private CarGoods carGoods;
    private int count;

    public CarGoods getCarGoods() {
        return carGoods;
    }

    public void setCarGoods(CarGoods carGoods) {
        this.carGoods = carGoods;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
