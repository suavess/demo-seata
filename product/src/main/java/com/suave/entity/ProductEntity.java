package com.suave.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author shunxin.jin
 * @date 2022/10/3 21:58
 */
@Data
@TableName("product")
public class ProductEntity {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private BigDecimal price;
    private Integer stock;
    private String remark;
    private String creator;
    private String updater;
    @TableLogic(value = "0", delval = "1")
    private Integer del;
    private Long createTime;
    private Long updateTime;
}
