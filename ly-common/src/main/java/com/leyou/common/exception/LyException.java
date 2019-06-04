package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 项目名:leyou
 * 包名: com.leyou.common.exception
 * 作者: Yanglinlong
 * 日期: 2019/6/3 19:25
 * @author lenovo
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LyException extends RuntimeException {
    private ExceptionEnum exceptionEnum;

}
