package com.xiaoting.snippet.spring;

import com.xiaoting.client.spring.CommonClientConfig;
import com.xiaoting.common.spring.CommonWebConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({ "com.xiaoting.snippet.client" })
@Import({ CommonClientConfig.class, CommonWebConfig.class })
public class SnippetClientConfig {

    public SnippetClientConfig() {
        super();
    }

}
