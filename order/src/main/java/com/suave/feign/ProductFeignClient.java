package com.suave.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shunxin.jin
 * @date 2022/10/3 22:58
 */
@FeignClient(value = "product")
public interface ProductFeignClient {
    @GetMapping("/product/reduceInventory")
    String reduceInventory(@RequestParam("id") Long id, @RequestParam("num") Integer num);
}
