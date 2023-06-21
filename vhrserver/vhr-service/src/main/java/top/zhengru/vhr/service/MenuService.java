package top.zhengru.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zhengru.vhr.mapper.MenuMapper;
import top.zhengru.vhr.mapper.MenuRoleMapper;
import top.zhengru.vhr.model.Menu;
import top.zhengru.vhr.model.Role;

import java.util.List;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/4/22
 * @Time: 18:46
 */
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Autowired
    MenuRoleMapper menuRoleMapper;

    public List<Menu> getAllMenusWithRole(){
        return menuMapper.getAllMenusWithRole();
    }

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    public List<Integer> getMidsByRid(Integer rid) {
        return menuMapper.getMidsByRid(rid);
    }

    @Transactional
    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        Integer delResult = menuRoleMapper.deleteByRid(rid);
        if (!(mids == null)) {
            Integer insertResult = menuRoleMapper.insertRecord(rid, mids);
            return insertResult == mids.length;
        }else if (delResult > 0 && mids == null){
            return true;
        }
        return false;
    }
}
