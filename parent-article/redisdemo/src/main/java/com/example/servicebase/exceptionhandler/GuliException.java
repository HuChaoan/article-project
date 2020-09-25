package com.example.servicebase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuanwentao
 * @Created: 2020-07-14
 */

@Data
@AllArgsConstructor //生成有参数构造方法
@NoArgsConstructor  //生成无参数构造方法
public class GuliException extends  RuntimeException{

    private Integer code ; //状态码
    private  String msg; //异常信息


}