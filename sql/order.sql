CREATE TABLE `order`
(
    `id`          bigint                                                        NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name`        varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户姓名',
    `pid`         bigint                                                        NOT NULL COMMENT '商品ID',
    `pname`       varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '商品名称',
    `price`       decimal(10, 2)                                                NOT NULL COMMENT '商品价格',
    `num`         int                                                           NOT NULL COMMENT '商品数量',
    `remark`      varchar(500) COLLATE utf8mb4_general_ci                                DEFAULT NULL COMMENT '备注',
    `creator`     varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  NOT NULL DEFAULT '' COMMENT '创建者',
    `updater`     varchar(64) COLLATE utf8mb4_general_ci                                 DEFAULT '' COMMENT '更新者',
    `del`         char(1) COLLATE utf8mb4_general_ci                                     DEFAULT '0' COMMENT '删除标志（0代表存在 1代表删除）',
    `create_time` bigint                                                        NOT NULL COMMENT '创建时间',
    `update_time` bigint                                                                 DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;