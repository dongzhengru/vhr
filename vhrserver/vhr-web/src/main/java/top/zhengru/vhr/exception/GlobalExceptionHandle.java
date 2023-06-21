package top.zhengru.vhr.exception;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.zhengru.vhr.model.RespBean;

import java.sql.SQLException;

/**
 * @Author: dongzhengru
 * @Blog: zhengru.top
 * @Date: 2023/4/27
 * @Time: 16:11
 */
@RestControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler(SQLException.class)
    public RespBean sqlException(SQLException e){
        if (e instanceof MySQLIntegrityConstraintViolationException){
            return RespBean.error("该数据有关联数据，操作失败");
        }
        return RespBean.error("数据库异常，操作失败！");
    }
}
