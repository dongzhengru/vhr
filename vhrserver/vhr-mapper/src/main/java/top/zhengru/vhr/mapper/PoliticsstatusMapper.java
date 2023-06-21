package top.zhengru.vhr.mapper;

import top.zhengru.vhr.model.Politicsstatus;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【politicsstatus】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Politicsstatus
*/
public interface PoliticsstatusMapper {

    List<Politicsstatus> getAllPoliticsstatus();
}




