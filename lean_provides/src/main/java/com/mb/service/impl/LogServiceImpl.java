package com.mb.service.impl;

import com.mb.service.LogService;

/**
 * @Author mubi
 * @Date 2018/12/25 11:15 AM
 */
public class LogServiceImpl implements LogService {
    @Override
    public void log(String msg) {
        System.out.println("------LOG: " + msg);
    }
}
