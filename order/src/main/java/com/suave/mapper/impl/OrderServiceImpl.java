package com.suave.mapper.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suave.entity.OrderEntity;
import com.suave.entity.ProductEntity;
import com.suave.feign.ProductFeignClient;
import com.suave.mapper.OrderMapper;
import com.suave.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author shunxin.jin
 * @date 2022/10/3 23:10
 */
@Slf4j
@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements OrderService {

    @Resource
    private ProductFeignClient productFeignClient;

    @Override
    @GlobalTransactional
    public OrderEntity createOrder(Long pid) {
        // 调用商品微服务，查询商品信息
        // 分支事务
        ProductEntity product = productFeignClient.getById(pid);
        log.info("查询到{}号商品的信息，内容是：{}", pid, JSON.toJSONString(product));

        // 创建订单
        OrderEntity order = new OrderEntity();

        order.setName("测试人员");
        order.setPid(product.getId());
        order.setPname(product.getName());
        order.setPrice(product.getPrice());
        order.setNum(4);
        order.setCreator("测试人员");
        order.setCreateTime(new Date().getTime());

        // 本地事务
        save(order);
        log.info("创建订单成功，订单信息为{}", JSON.toJSONString(order));

        // 扣库存
        // 分支事务
        productFeignClient.reduceInventory(pid, order.getNum());

        if (true) {
            throw new RuntimeException();
        }
        return order;
    }
}
