package top.zhengru.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhengru.vhr.mapper.PositionMapper;
import top.zhengru.vhr.model.Position;

import java.util.Date;
import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/4/26
 * @Time: 10:01
 */
@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;

    public List<Position> getAllPosition() {
        return positionMapper.getAllPosition();
    }

    public Integer addPosition(Position position) {
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.addPosition(position);
    }

    public Integer updatePosition(Position position) {
        return positionMapper.updatePosition(position);
    }

    public Integer deletePosition(Integer id) {
        return positionMapper.deletePosition(id);
    }

    public Integer deletePositionByIds(Integer[] ids) {
        return positionMapper.deletePositionByIds(ids);
    }
}