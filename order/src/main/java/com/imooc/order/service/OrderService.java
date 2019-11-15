package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/15 13:00
 * @Version 1.0
 */
@Service
public interface OrderService {

    public OrderDTO create(OrderDTO orderDTO);
}