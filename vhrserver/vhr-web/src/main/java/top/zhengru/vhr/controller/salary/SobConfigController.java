package top.zhengru.vhr.controller.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.zhengru.vhr.model.RespBean;
import top.zhengru.vhr.model.RespPageBean;
import top.zhengru.vhr.model.Salary;
import top.zhengru.vhr.service.EmployeeService;

import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/6/21
 * @Time: 21:10
 */

@RestController
@RequestMapping("/salary/sobcfg")
public class SobConfigController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
    public RespPageBean getEmployeeByPageWithSalary(@RequestParam(defaultValue = "1") Integer page
            , @RequestParam(defaultValue = "10") Integer size){
        return employeeService.getEmployeeByPageWithSalary(page,size);
    }
    @GetMapping("/salaries")
    public List<Salary> getAllSalaries(){
        return employeeService.getAllSalaries();
    }
    @PutMapping("/")
    public RespBean updateEmployeeSalaryById(@RequestParam Integer eid,@RequestParam Integer sid){
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
        if (result == 1 || result == 2){
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
