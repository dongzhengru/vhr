package top.zhengru.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhengru.vhr.mapper.SalaryMapper;
import top.zhengru.vhr.model.Salary;

import java.util.Date;
import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/6/21
 * @Time: 12:42
 */
@Service
public class SalaryService {
    @Autowired
    SalaryMapper salaryMapper;
    public List<Salary> getAllSalaries() {
        return salaryMapper.getAllSalaries();
    }
    public Integer addSalary(Salary salary) {
        salary.setCreateDate(new Date());
        return salaryMapper.insertSelective(salary);
    }

    public Integer deleteSalaryById(Integer id) {
        return salaryMapper.deleteByPrimaryKey(id);
    }

    public Integer updateSalaryById(Salary salary) {
        return salaryMapper.updateByPrimaryKeySelective(salary);
    }
}
