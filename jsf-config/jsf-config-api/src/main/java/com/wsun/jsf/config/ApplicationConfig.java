package com.wsun.jsf.config;

import lombok.Data;

/**
 * Created by Administrator on 2017/11/4 0004.
 */
@Data
public class ApplicationConfig extends AbstractConfig {

    // 应用名称
    private String name;

    // 模块版本
    private String version;

    // 应用负责人
    private String owner;

    // 组织名(BU或部门)
    private String organization;

    // 分层
    private String architecture;

    // 环境，如：dev/test/run
    private String environment;

    // Java代码编译器
    private String compiler;

    // 日志输出方式
    private String logger;

    // 是否为缺省
    private Boolean isDefault;


}
