package com.xiaoting.snippet.run;

import com.xiaoting.snippet.persistence.setup.MyApplicationContextInitializer;
import com.xiaoting.snippet.spring.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication(exclude = { // @formatter:off
        SecurityAutoConfiguration.class,
        ErrorMvcAutoConfiguration.class
})// @formatter:on
public class SnippetApp extends SpringBootServletInitializer {

    private final static Object[] CONFIGS = { // @formatter:off
            SnippetContextConfig.class,
            SnippetPersistenceJpaConfig.class,
            SnippetServiceConfig.class,
            SnippetWebConfig.class,
            SnippetServletConfig.class,
            SnippetApp.class
    }; // @formatter:on

    //

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(CONFIGS).initializers(new MyApplicationContextInitializer());
    }

    public static void main(final String... args) {
        final SpringApplication springApplication = new SpringApplication(CONFIGS);
        springApplication.addInitializers(new MyApplicationContextInitializer());
        springApplication.run(args);
    }

}
