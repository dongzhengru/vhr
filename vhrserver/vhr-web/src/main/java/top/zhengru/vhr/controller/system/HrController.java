package top.zhengru.vhr.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.zhengru.vhr.model.Hr;
import top.zhengru.vhr.model.RespBean;
import top.zhengru.vhr.model.Role;
import top.zhengru.vhr.service.HrService;
import top.zhengru.vhr.service.RoleService;

import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/5/8
 * @Time: 10:47
 */
@RestController
@RequestMapping("/system/hr")
public class HrController {
    @Autowired
    HrService hrService;
    @Autowired
    RoleService roleService;

    @GetMapping("/")
    public List<Hr> getAllHrs(String keywords){
        return hrService.getAllHrs(keywords);
    }

    @GetMapping("/roles")
    public List<Role> getRoles(){
        return roleService.getAllRoles();
    }

    @PutMapping("/")
    public RespBean updateHr(@RequestBody Hr hr){
        if (hrService.updateHr(hr) == 1){
            return RespBean.ok("更新成功！");
        }
        return RespBean.ok("更新失败！");
    }

    @PutMapping("/role")
    public RespBean updateHrRole(Integer hrid,Integer[] rids){
        if (hrService.updateHrRole(hrid,rids)){
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteHrById(@PathVariable Integer id){
        if (hrService.deleteHrById(id) == 1){
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败！");
    }
}
