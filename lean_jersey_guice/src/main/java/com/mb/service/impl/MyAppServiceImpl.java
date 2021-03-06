package com.mb.service.impl;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.mb.service.MyAppService;
import com.mb.service.LogService;
import com.mb.service.UserService;

/**
 * @Author mubi
 * @Date 2018/12/25 11:17 AM
 */
public class MyAppServiceImpl implements MyAppService {
    private UserService userService;
    private LogService logService;

    @Inject
    public MyAppServiceImpl(@Named("User2") UserService userService, LogService logService) {
        this.userService = userService;
        this.logService = logService;
    }

    @Override
    public String work() {
        String msg = userService.process();
        return logService.log(msg);
    }
}

