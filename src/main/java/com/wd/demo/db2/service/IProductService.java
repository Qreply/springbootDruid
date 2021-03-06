package com.wd.demo.db2.service;

import com.wd.demo.entity.Product;

import java.util.List;

public interface IProductService {

    /**
     * 添加一个商品
     *
     * @param product
     */
    void saveProduct(Product product);

    /**
     * 查询所有的商品
     *
     * @return
     */
    List<Product> findAllProducts();

    /**
     * 根据商品id查询商品信息
     * @param id
     * @return
     */
    Product findOne(Integer id);

    /**
     *更新商品信息
     * @param product
     */
    void update(Product product);

    /**
     * 根据商品id删除商品信息
     * @param id
     */
    void delete(Integer id);
}
