package top.zhengru.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhengru.vhr.mapper.EmployeeecMapper;
import top.zhengru.vhr.model.Employee;
import top.zhengru.vhr.model.RespPageBean;
import top.zhengru.vhr.vo.EmployeeecVO;

import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: blog.zhengru.top
 * @Date: 2023/9/1
 * @Time: 14:32
 */
@Service
public class EmployeeecService {
    @Autowired
    EmployeeecMapper employeeecMapper;

    public RespPageBean getEmployeeEcByPage(Integer page, Integer size, String keyword) {
        if (page != null && size != null){
            page = (page - 1) * size;
        }
        List<EmployeeecVO> data = employeeecMapper.getEmployeeEcByPage(page, size, keyword);
        Long total = employeeecMapper.getTotal(keyword);
        RespPageBean bean = new RespPageBean();
        bean.setTotal(total);
        bean.setData(data);
        return bean;
    }
}
