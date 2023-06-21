package top.zhengru.vhr.controller.config;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhengru.vhr.mapper.MenuMapper;
import top.zhengru.vhr.model.Hr;
import top.zhengru.vhr.model.Menu;
import top.zhengru.vhr.model.RespBean;
import top.zhengru.vhr.service.MenuService;

import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/4/22
 * @Time: 18:43
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Autowired
    MenuMapper menuMapper;
    @GetMapping("/menu")
    public List<Menu> getMenuByHrId(){
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
