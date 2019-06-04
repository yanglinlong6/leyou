package com.leyou.common.advice;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 项目名:leyou
 * 包名: com.leyou.common.advice
 * 作者: Yanglinlong
 * 日期: 2019/6/3 19:18
 * @author lenovo
 */
@Controller
public class CommonExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
     public ResponseEntity<ExceptionResult> handleException(LyException e){
        ExceptionEnum em = e.getExceptionEnum();
        return  ResponseEntity.status(em.getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
     }
}
