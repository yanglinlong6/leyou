package com.leyou.item.web;

import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 项目名:leyou
 * 包名: com.leyou.item.web
 * 作者: Yanglinlong
 * 日期: 2019/6/3 17:49
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
     private CategoryService categoryService;
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoyListByPid(@RequestParam("pid") long pid){
     return ResponseEntity.ok(categoryService.queryCategoyListByPid(pid));

    }
}
