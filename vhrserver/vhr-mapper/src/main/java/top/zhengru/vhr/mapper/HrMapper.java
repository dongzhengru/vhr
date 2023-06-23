package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.zhengru.vhr.model.Hr;
import top.zhengru.vhr.model.Role;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【hr】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Hr
*/
public interface HrMapper {
    Hr loadUserByUsername(String username);

    List<Role> getHrRolesById(Integer id);

    List<Hr> getAllHrs(@Param("id") Integer id,@Param("keywords") String keywords);

    Integer updateHr(Hr hr);

    Integer deleteHrById(Integer id);

    List<Hr> getAllHrsExceptCurrentHr(Integer id);
}




