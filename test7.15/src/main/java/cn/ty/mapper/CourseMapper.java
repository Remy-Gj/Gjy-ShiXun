package cn.ty.mapper;

import cn.ty.pojo.Course;
import cn.ty.pojo.CourseExample;
import java.util.List;

import cn.ty.pojo.OTD;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseMapper extends tk.mybatis.mapper.common.Mapper<Course> {

    List<OTD> findAll(@Param("cname") String cname);
}