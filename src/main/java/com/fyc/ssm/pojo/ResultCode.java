package com.fyc.ssm.pojo;

public enum  ResultCode {
    SUCCESS(true,10000,"操作成功！"),
    /* --系统错误返回码---*/
    FAIL(false,10001,"操作失败!"),
    UNAUTHENTICATED(false,10002,"你还没有登陆!"),
    UNAUTHORISE(false,10003,"权限不足!"),
    SERVER_ERROR(false,10004,"系统繁忙!"),
    //---用户操作返回码 2xxxx----
    MOBILE_OR_PASSWORD_ERROR(false,20001,"用户名或者密码错误!");

    //---企业操作返回码 3xxxx----
    //---权限操作返回码 4xxxx----
    //---其他操作返回码 5xxxx----

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    ResultCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
