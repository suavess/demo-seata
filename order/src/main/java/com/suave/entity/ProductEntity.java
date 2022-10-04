package com.suave.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author shunxin.jin
 * @date 2022/10/3 23:15
 */
@Data
public class ProductEntity {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private BigDecimal price;
    private Integer stock;
    private String remark;
    private String creator;
    private String updater;
    private Integer del;
    private Long createTime;
    private Long updateTime;
}
