package top.zhengru.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.zhengru.vhr.model.JobLevel;

import java.util.List;

/**
* @author 董政儒
* @description 针对表【joblevel】的数据库操作Mapper
* @createDate 2023-04-17 20:17:43
* @Entity top.zhengru.vhr.model.Joblevel
*/
public interface JobLevelMapper {
    List<JobLevel> getAllJobLevels();

    Integer addJobLevel(JobLevel joblevel);

    Integer updateJobLevelById(JobLevel jobLevel);

    Integer deleteJobLevelById(Integer id);

    Integer deletePositionByIds(@Param("ids") Integer[] ids);
}




