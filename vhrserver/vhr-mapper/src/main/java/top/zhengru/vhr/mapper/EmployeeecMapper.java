package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import top.zhengru.vhr.model.Employeeec;
import top.zhengru.vhr.vo.EmployeeecVO;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【employeeec】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Employeeec
*/
public interface EmployeeecMapper {

    List<EmployeeecVO> getEmployeeEcByPage(@Param("page") Integer page
            ,@Param("size") Integer size,@Param("keyword") String keyword);

    Long getTotal(String keyword);
}




