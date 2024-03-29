package com.tyrone.gateway.common.bean;

import lombok.Data;

@Data
public class ServiceInfo {
    private String serviceName;
    private String host;
    private Integer port;
    private Boolean alive;
}
