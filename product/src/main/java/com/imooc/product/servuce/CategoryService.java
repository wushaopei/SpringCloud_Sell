package com.imooc.product.servuce;

import com.imooc.product.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CategoryService
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/14 17:25
 * @Version 1.0
 */
@Service
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categotyTypeList);
}
