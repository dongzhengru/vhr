package top.zhengru.vhr.mapper;

import top.zhengru.vhr.model.Salary;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【salary】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Salary
*/
public interface SalaryMapper {

    List<Salary> getAllSalaries();

    Integer insertSelective(Salary salary);

    Integer deleteByPrimaryKey(Integer id);

    Integer updateByPrimaryKeySelective(Salary salary);
}




