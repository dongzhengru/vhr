package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.zhengru.vhr.model.Position;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【position】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Position
*/
public interface PositionMapper {

    List<Position> getAllPosition();
    Integer addPosition(Position position);

    Integer updatePosition(Position position);

    Integer deletePosition(Integer id);

    Integer deletePositionByIds(@Param("ids") Integer[] ids);
}




