package com.imooc.product.repository;

/**
 * @ClassName ProductInfoRepository
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/14 16:27
 * @Version 1.0
 */

import com.imooc.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName productInfoRepository
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/14 16:22
 * @Version 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String > {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}