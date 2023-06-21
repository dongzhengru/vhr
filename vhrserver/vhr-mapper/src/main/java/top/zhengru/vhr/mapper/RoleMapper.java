package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.zhengru.vhr.model.Role;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【role】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Role
*/
public interface RoleMapper {

    List<Role> getAllRoles();

    Integer addRole(Role role);

    Integer deleteRoleById(Integer id);
}




