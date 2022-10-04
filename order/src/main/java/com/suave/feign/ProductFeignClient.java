package com.suave.feign;

import com.suave.entity.ProductEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shunxin.jin
 * @date 2022/10/3 22:58
 */
@FeignClient(value = "product", contextId = "productFeignClient")
public interface ProductFeignClient {
    @GetMapping("/product/getById")
    ProductEntity getById(@RequestParam("id") Long id);

    @PostMapping("/product/reduceInventory")
    String reduceInventory(@RequestParam("id") Long id, @RequestParam("num") Integer num);
}
