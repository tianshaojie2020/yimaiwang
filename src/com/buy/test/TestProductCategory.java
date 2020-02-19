package com.buy.test;

import com.buy.dao.product.IProductCategory;
import com.buy.dao.product.ProductCategoryImpl;
import com.buy.entity.EasybuyProductCategory;
import org.junit.Test;

import java.util.List;

public class TestProductCategory {
    @Test
    public void testProduceCategory(){
        IProductCategory productCategory=new ProductCategoryImpl();
        List<EasybuyProductCategory> productCategories=productCategory.queryAllProductCategory("0");
        for (EasybuyProductCategory category:productCategories){
            System.out.println(category.getName());
        }
    }
}
