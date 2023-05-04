package com.example.usercenter.common;

public class ResultUtils {
    /**
     * @description: 成功
     * @param data
     * @return com.example.usercenter.common.BaseResponse<T>
     * @date: 2023/5/2 13:34
     */
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * @description: 失败
     * @param errorCode
     * @return com.example.usercenter.common.BaseResponse<T>
     * @date: 2023/5/2 13:35
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode);
    }

    /**
     * @description: 失败
     * @param code
     * @param message
     * @param description
     * @return com.example.usercenter.common.BaseResponse
     * @date: 2023/5/2 13:36
     */
    public static BaseResponse error(int code, String message, String description){
        return new BaseResponse(code,null,message,description);
    }

    /**
     * @description: 失败
     * @param errorCode
     * @param message
     * @param description
     * @return com.example.usercenter.common.BaseResponse
     * @date: 2023/5/2 13:37
     */
    public static BaseResponse error(ErrorCode errorCode, String message, String description){
        return new BaseResponse(errorCode.getCode(),null,message,description);
    }

    /**
     * @description: 失败
     * @param errorCode
     * @param description
     * @return com.example.usercenter.common.BaseResponse
     * @date: 2023/5/2 13:38
     */
    public static BaseResponse error(ErrorCode errorCode, String description){
        return new BaseResponse(errorCode.getCode(),null,errorCode.getMessage(),description);
    }
}
