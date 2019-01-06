package com.mb.guicemodule;

import com.google.inject.AbstractModule;
import com.mb.service.MyAppService;
import com.mb.service.LogService;
import com.mb.service.UserService;
import com.mb.service.impl.MyAppServiceImpl;
import com.mb.service.impl.LogServiceImpl;
import com.mb.service.impl.UserServiceImpl;

/**
 * @Author mubi
 * @Date 2018/12/25 11:05 AM
 */
public class MyAppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(LogService.class).to(LogServiceImpl.class);
        bind(UserService.class).to(UserServiceImpl.class);
        bind(MyAppService.class).to(MyAppServiceImpl.class);
    }
}
