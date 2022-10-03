package com.suave.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suave.entity.ProductEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shunxin.jin
 * @date 2022/10/3 22:06
 */
@Mapper
public interface ProductMapper extends BaseMapper<ProductEntity> {

}
