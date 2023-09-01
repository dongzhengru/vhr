package top.zhengru.vhr.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import top.zhengru.vhr.model.Employeeec;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: dongzhengru
 * @Blog: blog.zhengru.top
 * @Date: 2023/9/1
 * @Time: 17:25
 */
public class EmployeeecVO implements Serializable {
    /**
     *
     */
    private String ecName;

    /**
     * 员工编号
     */
    private String ecPosition;

    /**
     * 奖罚日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ecDate;

    /**
     * 奖罚原因
     */
    private String ecReason;

    /**
     * 奖罚分
     */
    private Integer ecPoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    private Integer ecType;

    /**
     * 备注
     */
    private String remark;

    public EmployeeecVO() {
    }

    public EmployeeecVO(String ecName, String ecPosition, Date ecDate, String ecReason, Integer ecPoint, Integer ecType, String remark) {
        this.ecName = ecName;
        this.ecPosition = ecPosition;
        this.ecDate = ecDate;
        this.ecReason = ecReason;
        this.ecPoint = ecPoint;
        this.ecType = ecType;
        this.remark = remark;
    }

    public String getEcName() {
        return ecName;
    }

    public void setEcName(String ecName) {
        this.ecName = ecName;
    }

    public String getEcPosition() {
        return ecPosition;
    }

    public void setEcPosition(String ecPosition) {
        this.ecPosition = ecPosition;
    }

    public Date getEcDate() {
        return ecDate;
    }

    public void setEcDate(Date ecDate) {
        this.ecDate = ecDate;
    }

    public String getEcReason() {
        return ecReason;
    }

    public void setEcReason(String ecReason) {
        this.ecReason = ecReason;
    }

    public Integer getEcPoint() {
        return ecPoint;
    }

    public void setEcPoint(Integer ecPoint) {
        this.ecPoint = ecPoint;
    }

    public Integer getEcType() {
        return ecType;
    }

    public void setEcType(Integer ecType) {
        this.ecType = ecType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
