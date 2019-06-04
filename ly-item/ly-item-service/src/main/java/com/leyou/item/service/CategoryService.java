package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 项目名:leyou
 * 包名: com.leyou.item.service
 * 作者: Yanglinlong
 * 日期: 2019/6/3 17:48
 * @author lenovo
 */
@Service
public class CategoryService {
    @Autowired
     private  CategoryMapper categoryMapper;

    public List<Category> queryCategoyListByPid(long pid) {

        Category t = new Category();
        t.setParentId(pid);
        List<Category> list = categoryMapper.select(t);
        if (CollectionUtils.isEmpty(list)){
            throw  new LyException(ExceptionEnum.CATEGORY_NOT_FOND);
        }
        return list;
    }
}
