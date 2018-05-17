package com.owner.common.exception;


/**
 * @Description:参数效验异常
 * Author	Version		Date		Changes
 * zhuangjianfa 1.0  2018年1月30日 Created
 */
public class ParamsValidateException extends RuntimeException{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 异常编码
     */
    private Integer code;
    
    /**
     * 错误消息
     */
    private String message;

    
    /**
     * TODO Class constructors.
     * @param code
     * @param message
     */
    public ParamsValidateException(Integer code, String message){
        super();
        this.code = code;
        this.message = message;
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
    
}
