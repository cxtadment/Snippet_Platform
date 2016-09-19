package com.xiaoting.client.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.xiaoting.common.client", "com.xiaoting.client" })
public class CommonClientConfig {

    public CommonClientConfig() {
        super();
    }

}
