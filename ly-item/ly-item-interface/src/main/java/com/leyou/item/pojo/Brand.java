package com.leyou.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 项目名:leyou
 * 包名: com.leyou.item.pojo
 * 作者: Yanglinlong
 * 日期: 2019/6/3 22:01
 * @author lenovo
 */
@Data
@Table(name="tb_brand")
public class Brand {
        @Id
        @KeySql(useGeneratedKeys=true)
        private Long id;
        private String name;
        private String image;
        private Character letter;

        // getter和setter略
        // 注意isParent的get和set方法
}
