package com.imooc.product.servuce;

import com.imooc.product.dataobject.ProductInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/14 17:12
 * @Version 1.0
 */
@Service
public interface ProductService {

    /*
    *  查询所有在架商品列表
    * */
    List<ProductInfo> findUpAll();

}
