package com.example.goldTradeDemo.service;

import com.example.goldTradeDemo.common.MsgSource;

public abstract class AbstractCommonService {

    protected MsgSource msgSource;

    public AbstractCommonService(MsgSource msgSource) {
        this.msgSource = msgSource;
    }
}
