package top.zhengru.vhr.controller.salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.zhengru.vhr.model.RespBean;
import top.zhengru.vhr.model.Salary;
import top.zhengru.vhr.service.SalaryService;

import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/6/21
 * @Time: 12:40
 */
@RestController
@RequestMapping("/salary/sob")
public class SalaryController {
    @Autowired
    SalaryService salaryService;
    @GetMapping("/")
    public List<Salary> getAllSalaries(){
        return salaryService.getAllSalaries();
    }
    @PostMapping("/")
    public RespBean addSalary(@RequestBody Salary salary) {
        if (salaryService.addSalary(salary) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }
    @DeleteMapping("/{id}")
    public RespBean deleteSalaryById(@PathVariable Integer id) {
        if (salaryService.deleteSalaryById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }
    @PutMapping("/")
    public RespBean updateSalaryById(@RequestBody Salary salary) {
        if (salaryService.updateSalaryById(salary) == 1) {
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
