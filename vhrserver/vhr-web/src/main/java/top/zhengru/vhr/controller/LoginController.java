package top.zhengru.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhengru.vhr.model.RespBean;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/4/21
 * @Time: 21:06
 */
@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录！");
    }
}
