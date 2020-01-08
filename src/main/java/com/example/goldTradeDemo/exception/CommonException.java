package com.example.goldTradeDemo.exception;

import com.example.goldTradeDemo.common.ConstErrorMsg;

public class CommonException extends RuntimeException {

    private ConstErrorMsg constErrorMsg;

    public CommonException(ConstErrorMsg constErrorMsg) {
        this.constErrorMsg = constErrorMsg;
    }

    public ConstErrorMsg getConstErrorMsg() {
        return constErrorMsg;
    }
}