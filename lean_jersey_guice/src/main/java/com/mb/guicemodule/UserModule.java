package com.mb.guicemodule;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import com.google.inject.servlet.ServletModule;
import com.mb.service.UserService;
import com.mb.service.impl.UserServiceImpl;
import com.mb.service.impl.UserServiceImpl2;
import com.mb.http.UserResource;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

/**
 * @Author mubi
 * @Date 2018/12/25 11:05 AM
 */
public class UserModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new ServletModule() {
            @Override
            protected void configureServlets() {
                // 绑定资源
                bind(UserResource.class);

                // interface绑定
                bind(UserService.class).annotatedWith(Names.named("User")).to(UserServiceImpl.class);
                bind(UserService.class).annotatedWith(Names.named("User2")).to(UserServiceImpl2.class);

                // 集成jersey访问
                bind(GuiceContainer.class);

                // 集成jackson json格式转换
                bind(JacksonJsonProvider.class).in(Scopes.SINGLETON);
                //项目访问路径配置
                serve("/*").with(GuiceContainer.class);
            }
        });
    }


}
