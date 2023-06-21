package top.zhengru.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zhengru.vhr.mapper.MenuRoleMapper;
import top.zhengru.vhr.mapper.RoleMapper;
import top.zhengru.vhr.model.Menu;
import top.zhengru.vhr.model.Role;

import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/5/1
 * @Time: 13:51
 */
@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    MenuRoleMapper menuRoleMapper;
    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    public Integer addRole(Role role) {
        if (role.getName().startsWith("ROLE_")){
            role.setName("ROLE_" + role.getName());
        }
        return roleMapper.addRole(role);
    }

    @Transactional
    public Integer deleteRoleById(Integer id) {
        menuRoleMapper.deleteByRid(id);
        return roleMapper.deleteRoleById(id);
    }
}
