package top.zhengru.vhr.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhengru.vhr.mapper.EmployeeMapper;
import top.zhengru.vhr.mapper.SalaryMapper;
import top.zhengru.vhr.model.Employee;
import top.zhengru.vhr.model.RespPageBean;
import top.zhengru.vhr.model.Salary;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/5/8
 * @Time: 14:54
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SalaryMapper salaryMapper;
    @Autowired
    RabbitTemplate rabbitTemplate;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");
    public RespPageBean getEmployeeByPage(Integer page, Integer size, Employee employee, Date[] beginDateScope) {
        if (page != null && size != null){
            page = (page - 1) * size;
        }
        if (employee != null) {
            if (employee.getName() != null && employee.getName() != "") {
                page = 0;
            }
        }
        List<Employee> data = employeeMapper.getEmployeeByPage(page,size,employee,beginDateScope);
        Long total = employeeMapper.getTotal(employee,beginDateScope);
        RespPageBean bean = new RespPageBean();
        bean.setTotal(total);
        bean.setData(data);
        return bean;
    }

    public Integer addEmp(Employee employee) {
        Date beginDate = employee.getBeginContract();
        Date endDate = employee.getEndContract();
        double month = (Double.parseDouble(yearFormat.format(endDate)) - Double.parseDouble(yearFormat.format(beginDate)))*12
                + (Double.parseDouble(monthFormat.format(endDate)) - Double.parseDouble(monthFormat.format(beginDate)));
        employee.setContractTerm(Double.parseDouble(decimalFormat.format(month / 12)));
        Integer result = employeeMapper.insertSelective(employee);
        if (result == 1) {
            Employee emp = employeeMapper.getEmployeeById(employee.getId());
            logger.info(emp.toString());
            rabbitTemplate.convertAndSend("zhengru.mail.welcome",emp);
        }
        return result;
    }

    public Integer maxWorkID() {
        return employeeMapper.maxWorkID();
    }

    public Integer deleteEmpByEid(Integer id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }

    public Integer updateEmp(Employee employee) {
        return employeeMapper.updateByPrimaryKeySelective(employee);
    }

    public Integer addEmps(List<Employee> list) {
        return employeeMapper.addEmps(list);
    }

    public RespPageBean getEmployeeByPageWithSalary(Integer page, Integer size) {
        if (page != null && size != null){
            page = (page - 1) * size;
        }
        List<Employee> list = employeeMapper.getEmployeeByPageWithSalary(page,size);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(list);
        respPageBean.setTotal(employeeMapper.getTotal(null,null));
        return respPageBean;


    }

    public List<Salary> getAllSalaries() {
        return salaryMapper.getAllSalaries();
    }

    public Integer updateEmployeeSalaryById(Integer eid, Integer sid) {
        return employeeMapper.updateEmployeeSalaryById(eid,sid);
    }
}
