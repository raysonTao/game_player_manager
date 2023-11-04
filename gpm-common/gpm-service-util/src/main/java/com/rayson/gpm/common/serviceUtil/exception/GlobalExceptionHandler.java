package com.rayson.gpm.common.serviceUtil.exception;


import com.rayson.gpm.common.serviceUtil.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//AOP 面向切面
@ControllerAdvice //是Spring MVC中的一个注解，它被用作全局的控制器增强。
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class) //异常处理器
    @ResponseBody  //返回json数据
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail(null);
    }

    //自定义异常处理
    @ExceptionHandler(GpmException.class)
    @ResponseBody
    public Result error(GpmException exception) {
        return Result.build(null,exception.getCode(),exception.getMessage());
    }
}
