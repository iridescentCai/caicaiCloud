package com.caicai.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObject<T> {
    private final Integer successCode = 1;
    private final Integer failCode = -1;

    private Integer stateCode;

    private Object data;

    public ResponseObject getSuccessResponse(Object data) {
        return new ResponseObject(successCode, data);
    }

    public ResponseObject getFailResponse() {
        return new ResponseObject(failCode, null);
    }
}
