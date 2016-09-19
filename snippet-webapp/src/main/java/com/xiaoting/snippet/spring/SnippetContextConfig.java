package com.xiaoting.snippet.spring;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ImportResource("classpath*:umContextConfig.xml")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@PropertySource({ "classpath:env-${envTarget:dev}.properties" })
public class SnippetContextConfig {

    public SnippetContextConfig() {
        super();
    }

    // beans

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        final PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        return pspc;
    }

}
