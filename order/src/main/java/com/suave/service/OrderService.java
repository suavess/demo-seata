package com.suave.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suave.entity.OrderEntity;

/**
 * @author shunxin.jin
 * @date 2022/10/3 23:09
 */
public interface OrderService extends IService<OrderEntity> {
    OrderEntity createOrder(Long pid);
}
