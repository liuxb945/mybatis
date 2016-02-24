CREATE TABLE
    ts_navi
    (
        navi_id INT NOT NULL AUTO_INCREMENT COMMENT '导航ID',
        navi_name VARCHAR(255) COMMENT '导航名称',
        app_name VARCHAR(255) COMMENT '应用标志，如index、home、public等',
        url VARCHAR(255) COMMENT '链接地址',
        target VARCHAR(10) COMMENT '打开方式',
        status INT(1) COMMENT '状态（0关闭，1开启）',
        position VARCHAR(10) COMMENT '导航位置',
        guest INT(1) COMMENT '是否游客可见（0否，1是，默认1）',
        is_app_navi INT(1) COMMENT '是否应用内部导航 （0否，1是，默认1）',
        parent_id INT COMMENT '（父导航，默认为0）',
        order_sort INT COMMENT '应用排序 默认255',
        PRIMARY KEY (navi_id),
        INDEX status_postion (status, position)
    )
    ENGINE=MyISAM DEFAULT CHARSET=utf8