package cn.ty.mapper;

import cn.ty.pojo.CourseType;
import cn.ty.pojo.CourseTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseTypeMapper extends tk.mybatis.mapper.common.Mapper<CourseType> {

}