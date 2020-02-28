package com.frankie.demo.oop;


import lombok.Getter;

/**
 * @author: Yao Frankie
 * @date: 2020/2/28 16:12
 */
@Getter
public enum OrderErrorEnum {

    ORDER_AMOUNT_ERROR("RCOE0001", "订单金额不能小于零"),
    ORDER_TYPE_ERROR  ("RCOE0002", "该用户不支持该订单类型"),
    ;

    private final String errorCode;
    private final String errorMsg;

    OrderErrorEnum(String errorCode, String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
