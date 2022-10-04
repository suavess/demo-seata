package com.suave.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suave.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shunxin.jin
 * @date 2022/10/3 23:10
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
}
