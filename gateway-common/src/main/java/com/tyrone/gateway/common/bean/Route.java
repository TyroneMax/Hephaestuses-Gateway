package com.tyrone.gateway.common.bean;

import com.sun.scenario.effect.impl.prism.PrImage;
import lombok.Data;

@Data
public class Route {
    private Long id;
    private String routeName;
    private Boolean stripPrefix;
    private Integer order;
    private String upstream;

}
