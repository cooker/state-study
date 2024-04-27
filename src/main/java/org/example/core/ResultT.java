package org.example.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * grant
 * 27/4/2024 8:48 pm
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultT<T> implements Serializable {

    private static final long serialVersionUID = 7431230842476074598L;
    private Integer code;
    private String msg;
    private T data;

    public static <T> ResultT<T> success(T data) {
        return new ResultT<>(200, "ok", data);
    }

    public static <T> ResultT<T> fail() {
        return new ResultT<>(500, "fail", null);
    }

    public static <T> ResultT<T> fail(String msg) {
        return new ResultT<>(500, msg, null);
    }
}
