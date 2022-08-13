package com.atguigu.e.exception;

/**
 * @author Wint
 * @create 2022-06-22 11:11
 */
//自定义异常类
public class EcDef extends Exception{
    static final long serialVersionUID = -33875164229948L;

    public EcDef() {
    }

    public EcDef(String msg) {
        super(msg);
    }
}
