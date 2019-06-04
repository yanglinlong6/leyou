package com.leyou.common.vo;

import lombok.Data;

import java.util.List;

/**
 * 项目名:leyou
 * 包名: com.leyou.common.vo
 * 作者: Yanglinlong
 * 日期: 2019/6/3 22:10
 * @author lenovo
 * view object
 */
@Data
public class PageResult<T> {
    private Long total;
    private Integer totalPage;
    private List<T> items;
    public PageResult(){

    }

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}
