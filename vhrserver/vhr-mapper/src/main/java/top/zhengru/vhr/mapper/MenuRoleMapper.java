package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;
import top.zhengru.vhr.model.MenuRole;

/**
* @author 董政儒
* @description 针对表【menu_role】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.MenuRole
*/
public interface MenuRoleMapper {

    Integer deleteByRid(Integer rid);

    Integer insertRecord(@Param("rid") Integer rid,@Param("mids") Integer[] mids);
}




