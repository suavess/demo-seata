package com.suave.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suave.entity.ProductEntity;
import com.suave.mapper.ProductMapper;
import com.suave.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shunxin.jin
 * @date 2022/10/3 22:04
 */
@Service("productService")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, ProductEntity> implements ProductService {

    /**
     * 减少商品库存
     *
     * @param id  商品id
     * @param num 库存数量
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void reduceInventory(Long id, Integer num) {
        ProductEntity product = getById(id);
        // 减库存
        int stock = product.getStock() - num;
        LambdaUpdateWrapper<ProductEntity> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper
                .set(ProductEntity::getStock, stock)
                .eq(ProductEntity::getId, product.getId());
        update(updateWrapper);
    }
}
