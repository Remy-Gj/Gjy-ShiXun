package cn.ty.service;

import cn.ty.pojo.Goods;
import com.github.pagehelper.PageInfo;

/**
 * @author Remy~
 * @date 来自:2021年07月13日 19:59
 */
public interface GoodsService {
    PageInfo<Goods> findAll(Integer pageNum, Integer pageSize);
}
