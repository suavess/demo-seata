package com.suave.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suave.entity.ProductEntity;

/**
 * @author shunxin.jin
 * @date 2022/10/3 21:56
 */
public interface ProductService extends IService<ProductEntity> {

    /**
     * 减少商品库存
     *
     * @param id  商品id
     * @param num 库存数量
     */
    void reduceInventory(Long id, Integer num);
}
