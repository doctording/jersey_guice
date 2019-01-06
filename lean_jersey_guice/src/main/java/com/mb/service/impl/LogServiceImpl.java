package com.mb.service.impl;

import com.mb.service.LogService;

/**
 * @Author mubi
 * @Date 2018/12/25 11:15 AM
 */
public class LogServiceImpl implements LogService {
    @Override
    public String log(String msg) {
       return String.format("Log: %s", msg);
    }
}
