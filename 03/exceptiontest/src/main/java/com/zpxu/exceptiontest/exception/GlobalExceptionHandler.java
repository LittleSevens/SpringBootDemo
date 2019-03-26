package com.zpxu.exceptiontest.exception;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object globalErrorHandler(HttpServletRequest request, Exception e){
        System.out.println("GlobalHandler globalErrorHandler()......");
        Map<String,Object> map = new HashMap<>();
        map.put("code",100);
        map.put("message",e.getMessage());
        map.put("url",request.getRequestURL().toString());
        map.put("data","请求失败");
        return map;
    }
}
