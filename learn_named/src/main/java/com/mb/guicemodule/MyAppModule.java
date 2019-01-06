package com.mb.guicemodule;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.mb.service.*;
import com.mb.service.impl.MyAppServiceImpl;
import com.mb.service.impl.LogServiceImpl;
import com.mb.service.impl.UserServiceImpl;
import com.mb.service.impl.UserServiceImpl2;

/**
 * @Author mubi
 * @Date 2018/12/25 11:05 AM
 */
public class MyAppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(UserService.class).annotatedWith(Names.named("User")).to(UserServiceImpl.class);
        bind(UserService.class).annotatedWith(Names.named("User2")).to(UserServiceImpl2.class);

        bind(LogService.class).to(LogServiceImpl.class);
        bind(MyAppService.class).to(MyAppServiceImpl.class);
    }

}
