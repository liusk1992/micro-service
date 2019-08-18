package com.liusk.order.domain;

/**
 * @author : liusk
 * @date : 2019/8/18 16:15
 */
public class OrderDO {

    private String orderNo;

    private String payAmount;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }
}
