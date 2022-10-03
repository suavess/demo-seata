package com.suave.controller;

import com.suave.entity.ProductEntity;
import com.suave.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shunxin.jin
 * @date 2022/10/3 22:11
 */
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getById")
    public ProductEntity getById(Integer id) {
        return productService.getById(id);
    }

    @PostMapping("/reduceInventory")
    public String reduceInventory(@RequestParam("id") Long id, @RequestParam("num") Integer num) {
        productService.reduceInventory(id, num);
        return "success";
    }
}
