package com.example.goldTradeDemo.exception;

import com.example.goldTradeDemo.common.ConstErrorMsg;

public class CommonConflictException extends CommonException {

    public CommonConflictException(ConstErrorMsg constErrorMsg) {
        super(constErrorMsg);
    }
}
