package top.zhengru.vhr.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import top.zhengru.vhr.model.Hr;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/5/8
 * @Time: 11:11
 */
public class HrUtils {
    public static Hr getCurrentHr(){
        return (Hr) (SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
