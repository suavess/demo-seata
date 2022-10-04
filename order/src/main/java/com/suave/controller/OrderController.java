package com.suave.controller;

import com.suave.entity.OrderEntity;
import com.suave.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shunxin.jin
 * @date 2022/10/3 23:11
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @PostMapping("/create")
    public OrderEntity create(@RequestParam("id") Long id) {
        return orderService.createOrder(id);
    }

}
