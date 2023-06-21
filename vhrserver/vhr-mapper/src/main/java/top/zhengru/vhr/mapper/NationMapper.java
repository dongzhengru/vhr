package top.zhengru.vhr.mapper;

import top.zhengru.vhr.model.Nation;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【nation】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Nation
*/
public interface NationMapper {

    List<Nation> getAllNations();
}




