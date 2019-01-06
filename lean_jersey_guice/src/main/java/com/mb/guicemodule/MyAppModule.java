package com.mb.guicemodule;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.servlet.ServletModule;
import com.mb.http.MyResource;
import com.mb.service.*;
import com.mb.service.impl.MyAppServiceImpl;
import com.mb.service.impl.LogServiceImpl;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

/**
 * @Author mubi
 * @Date 2018/12/25 11:05 AM
 */
public class MyAppModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new ServletModule() {
            @Override
            protected void configureServlets() {
            // 绑定资源
            bind(MyResource.class);

            // 绑定接口资源
            bind(LogService.class).to(LogServiceImpl.class);
            bind(MyAppService.class).to(MyAppServiceImpl.class);

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
