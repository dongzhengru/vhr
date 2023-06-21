package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.zhengru.vhr.model.Department;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【department】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Department
*/
public interface DepartmentMapper {
    List<Department> getAllDepartmentsByParentId(Integer pid);
    void addDep(Department dep);
    void deleteDepById(Department dep);
    List<Department> getAllDepartmentsWithOutChildren();
}




