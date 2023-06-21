package top.zhengru.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhengru.vhr.mapper.JobLevelMapper;
import top.zhengru.vhr.model.JobLevel;

import java.util.Date;
import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/4/28
 * @Time: 16:03
 */
@Service
public class JobLevelService {
    @Autowired
    JobLevelMapper joblevelMapper;

    public List<JobLevel> getAllJobLevels() {
        return joblevelMapper.getAllJobLevels();
    }

    public Integer addJobLevel(JobLevel jobLevel) {
        jobLevel.setCreateDate(new Date());
        jobLevel.setEnabled(true);
        return joblevelMapper.addJobLevel(jobLevel);
    }

    public Integer updateJobLevelById(JobLevel jobLevel) {
        return joblevelMapper.updateJobLevelById(jobLevel);
    }

    public Integer deleteJobLevelById(Integer id) {
        return joblevelMapper.deleteJobLevelById(id);
    }

    public Integer deletePositionByIds(Integer[] ids) {
        return joblevelMapper.deletePositionByIds(ids);
    }
}
