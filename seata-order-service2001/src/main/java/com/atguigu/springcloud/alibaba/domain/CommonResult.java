package com.atguigu.springcloud.alibaba.domain;

/**
 * @auther zzyy
 * @create 2020-02-26 15:16
 */

public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message, Object o)
    {
        this.code =code;
        this.message=message;
        this.data = null;
    }

}
