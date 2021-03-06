package com.taiji.dianthus.common;

/**
 * @ClassName BusinessMessage
 * @Description 通用业务信息类12
 * @Author H.M
 * @Date 2019/9/25
 */
public class BusinessMessage<T> {

    /**
     * 业务执行结果
     */
    public Boolean success = false;
    /**
     * 业务代码
     */
    public String code = "";
    /**
     * 业务消息
     */
    public String msg = "";
    /**
     * 业务数据
     */
    public T data;

    public BusinessMessage(Boolean success) {
        this.success = success;
    }

    public BusinessMessage() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}