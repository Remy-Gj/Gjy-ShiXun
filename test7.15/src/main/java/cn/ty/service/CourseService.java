package cn.ty.service;

import cn.ty.pojo.OTD;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

/**
 * @author Remy~
 * @date 来自:2021年07月15日 17:16
 */
public interface CourseService {
    PageInfo<OTD> findAll(Integer pageNum, Integer pageSize, String cname);
}
