package com.imooc.product.vo;

import lombok.Data;

/**
 * @ClassName ResultVO
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/15 10:05
 * @Version 1.0
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
