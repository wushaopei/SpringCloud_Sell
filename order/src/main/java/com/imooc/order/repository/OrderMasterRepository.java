package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName OrderMasterRepository
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/15 11:24
 * @Version 1.0
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
