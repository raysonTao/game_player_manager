package com.rayson.gpm.common.serviceUtil.exception;


import com.rayson.gpm.common.serviceUtil.result.ResultCodeEnum;
import lombok.Data;

@Data
public class GpmException extends RuntimeException{

    //异常状态码
    private Integer code;

    /**
     * 通过状态码和错误消息创建异常对象
     * @param message
     * @param code
     */
    public GpmException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 接收枚举类型对象
     * @param resultCodeEnum
     */
    public GpmException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

}
