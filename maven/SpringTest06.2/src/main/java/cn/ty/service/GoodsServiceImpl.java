package cn.ty.service;

import cn.ty.mapper.GoodsMapper;
import cn.ty.pojo.Goods;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Remy~
 * @date 来自:2021年07月13日 20:39
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public PageInfo<Goods> findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goods = goodsMapper.selectAll();
        PageInfo<Goods> pageInfo = new PageInfo<>(goods);
        return pageInfo;
    }
}
