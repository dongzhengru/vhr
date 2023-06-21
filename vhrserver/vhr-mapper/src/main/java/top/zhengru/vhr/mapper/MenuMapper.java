package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.zhengru.vhr.model.Menu;
import top.zhengru.vhr.model.Role;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【menu】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Menu
*/
public interface MenuMapper {

    List<Menu> getMenusByHrId(Integer hrId);

    List<Menu> getAllMenusWithRole();

    List<Menu> getAllMenus();

    List<Integer> getMidsByRid(Integer rid);
}




