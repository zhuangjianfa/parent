package com.owner.common;

import java.io.Serializable;

/**
 * @Description:公共结果集类
 * Author	Version		Date		Changes
 * zhuangjianfa 1.0  2018年1月24日 Created
 */
public class Result<T> implements Serializable{
    /**
     * 序列化
     */
    private static final long serialVersionUID = 1L;

    /**
     * 返回编码,默认是请求成功的
     */
    private Integer code = 0;
    
    /**
     * 返回消息
     */
    private String message = "操作成功.";

    /**
     * 返回结果集,resp
     */
    private T data;
    
    /**
     * 总数
     */
    private Integer totalNum;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(T data) {
        this.data = data;
    }

    public Result() {
    }

    /**
     * Returns this code object.
     * @return this code
     */
    public Integer getCode() {
        return code;
    }
    
    /**
     * Sets this code.
     * @param code this code to set
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Returns this message object.
     * @return this message
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Sets this message.
     * @param message this message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    /**
     * Returns this data object.
     * @return this data
     */
    public T getData() {
        return data;
    }

    
    /**
     * Sets this data.
     * @param data this data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    
    /**
     * Returns this totalNum object.
     * @return this totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    
    /**
     * Sets this totalNum.
     * @param totalNum this totalNum to set
     */
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }
}
