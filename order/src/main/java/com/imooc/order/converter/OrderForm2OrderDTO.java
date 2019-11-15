package com.imooc.order.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.ResultEnum;
import com.imooc.order.exception.OrderException;
import com.imooc.order.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OrderForm2OrderDTO
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/15 14:33
 * @Version 1.0
 */
@Slf4j
public class OrderForm2OrderDTO {

    public static OrderDTO convert(OrderForm orderForm){
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        orderDTO.setBuyerPhone(orderForm.getPhone());

        List<OrderDetail> orderDetails  = new ArrayList<>();
        //将对象转为json格式
       try {
           orderDetails = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {
           }.getType());
       }catch (Exception e){
            log.error("【json转换】 错误，string={}",orderForm.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(),ResultEnum.PARAM_ERROR.getMessage());
       }
       orderDTO.setOrderDetailList(orderDetails);

       return orderDTO;
    }

}
