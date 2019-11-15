package com.imooc.product.servuce.impl;

import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.enums.ProductStatusEnum;
import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.servuce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/14 17:14
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
