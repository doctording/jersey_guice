package com.mb.service.impl;

import com.google.inject.Inject;
import com.mb.service.*;

/**
 * @Author mubi
 * @Date 2018/12/25 11:17 AM
 */
public class MyAppServiceImpl implements MyAppService {
    private UserService userService;
    private LogService logService;

    @Inject
    public MyAppServiceImpl(@User2 UserService userService, LogService logService) {
        this.userService = userService;
        this.logService = logService;
    }

    @Override
    public void work() {
        String msg = userService.process();
        logService.log(msg);
    }
}

