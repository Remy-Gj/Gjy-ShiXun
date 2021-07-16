package cn.ty.controller;

import cn.ty.pojo.OTD;
import cn.ty.service.CourseService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Remy~
 * @date 来自:2021年07月15日 17:15
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/findAll")
    public String findAll(Model model, @RequestParam(defaultValue = "1")Integer pageNum, @RequestParam(defaultValue = "2")Integer pageSize,String cname) {
        PageInfo<OTD> all = courseService.findAll(pageNum, pageSize, cname);
        model.addAttribute("pageInfo",all);
        model.addAttribute("cname",cname);
        return "show";
    }
}
