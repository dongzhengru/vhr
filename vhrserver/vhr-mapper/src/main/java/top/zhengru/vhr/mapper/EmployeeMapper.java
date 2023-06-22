package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import top.zhengru.vhr.model.Employee;

import java.util.Date;
import java.util.List;

/**
* @author 董政儒
* @description 针对表【employee】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Employee
*/
public interface EmployeeMapper {

    List<Employee> getEmployeeByPage(@Param("page") Integer page, @Param("size") Integer size
            , @Param("emp") Employee employee, @Param("beginDateScope") Date[] beginDateScope);

    Long getTotal(@Param("emp") Employee employee, @Param("beginDateScope") Date[] beginDateScope);
    Integer insertSelective(Employee employee);
    Integer maxWorkID();
    Integer deleteByPrimaryKey(Integer id);

    Integer updateByPrimaryKeySelective(Employee employee);

    Integer addEmps(List<Employee> list);

    Employee getEmployeeById(Integer id);

    List<Employee> getEmployeeByPageWithSalary(@Param("page") Integer page,@Param("size") Integer size);

    Integer updateEmployeeSalaryById(@Param("eid") Integer eid,@Param("sid") Integer sid);
}




