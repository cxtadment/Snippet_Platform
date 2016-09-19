package com.xiaoting.snippet.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.xiaoting.snippet.service" })
public class SnippetServiceConfig {

    public SnippetServiceConfig() {
        super();
    }

}
