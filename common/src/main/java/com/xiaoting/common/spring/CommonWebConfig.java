package com.xiaoting.common.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.xiaoting.common.web" })
public class CommonWebConfig {

    public CommonWebConfig() {
        super();
    }

}
