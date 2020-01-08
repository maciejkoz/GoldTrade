package com.example.goldTradeDemo.exception;

import com.example.goldTradeDemo.common.ConstErrorMsg;

public class CommonBadRequestException extends CommonException {

    public CommonBadRequestException(ConstErrorMsg constErrorMsg) {
        super(constErrorMsg);
    }
}
