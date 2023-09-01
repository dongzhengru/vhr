package top.zhengru.vhr.controller.per;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.zhengru.vhr.model.RespPageBean;
import top.zhengru.vhr.service.EmployeeecService;

/**
 * @Author: dongzhengru
 * @Blog: blog.zhengru.top
 * @Date: 2023/9/1
 * @Time: 14:30
 */
@RestController
@RequestMapping("/personnel/ec")
public class PerEcController {
    @Autowired
    EmployeeecService employeeecService;

    @GetMapping("/")
    public RespPageBean getEmployeeEcByPage(@RequestParam(defaultValue = "1") Integer page
            , @RequestParam(defaultValue = "10") Integer size, String keyword){
        return employeeecService.getEmployeeEcByPage(page, size, keyword);
    }
}
