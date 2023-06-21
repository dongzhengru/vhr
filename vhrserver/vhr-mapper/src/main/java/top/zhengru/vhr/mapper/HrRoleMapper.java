package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.zhengru.vhr.model.HrRole;

/**
* @author 董政儒
* @description 针对表【hr_role】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.HrRole
*/
public interface HrRoleMapper {

    void deleteByHrId(Integer hrid);

    Integer addRole(@Param("hrid") Integer hrid,@Param("rids") Integer[] rids);
}




