package com.imooc.product.servuce.impl;

import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.servuce.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CategoryServiceImpl
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/14 17:26
 * @Version 1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categotyTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categotyTypeList);
    }
}
