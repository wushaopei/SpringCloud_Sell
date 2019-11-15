package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @ClassName OrderException
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/15 14:27
 * @Version 1.0
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
