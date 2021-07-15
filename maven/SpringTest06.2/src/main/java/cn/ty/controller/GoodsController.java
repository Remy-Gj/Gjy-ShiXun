package cn.ty.controller;

import cn.ty.pojo.Goods;
import cn.ty.service.GoodsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Remy~
 * @date 来自:2021年07月13日 19:57
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/findAll")
    public String findAll(Model model,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "2")Integer pageSize ){
        PageInfo<Goods> all = goodsService.findAll(pageNum, pageSize);
        model.addAttribute("PageInfo",all);
        return "show";
    }
}
