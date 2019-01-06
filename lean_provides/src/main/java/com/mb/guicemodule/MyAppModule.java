package com.mb.guicemodule;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.mb.service.*;
import com.mb.service.impl.MyAppServiceImpl;
import com.mb.service.impl.LogServiceImpl;
import com.mb.service.impl.UserServiceImpl2;

/**
 * @Author mubi
 * @Date 2018/12/25 11:05 AM
 */
public class MyAppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(LogService.class).to(LogServiceImpl.class);
        bind(MyAppService.class).to(MyAppServiceImpl.class);
    }

    @Provides
    @Named("User2")
    UserService createUserService() {
        // 自定义UserService的实现类
        UserService userService = new UserServiceImpl2();
        return userService;
    }

}
