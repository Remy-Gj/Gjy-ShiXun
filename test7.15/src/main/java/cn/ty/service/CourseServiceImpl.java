package cn.ty.service;

import cn.ty.mapper.CourseMapper;
import cn.ty.pojo.OTD;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Remy~
 * @date 来自:2021年07月15日 17:18
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public PageInfo<OTD> findAll(Integer pageNum, Integer pageSize, String cname) {
        PageHelper.startPage(pageNum,pageSize);
        List<OTD> all = courseMapper.findAll(cname);
        PageInfo<OTD> otdPageInfo = new PageInfo<>(all);
        return otdPageInfo;
    }
}
