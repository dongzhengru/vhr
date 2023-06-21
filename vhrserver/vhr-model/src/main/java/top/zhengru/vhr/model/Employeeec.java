package top.zhengru.vhr.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName employeeec
 */
public class Employeeec implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 员工编号
     */
    private Integer eid;

    /**
     * 奖罚日期
     */
    private Date ecdate;

    /**
     * 奖罚原因
     */
    private String ecreason;

    /**
     * 奖罚分
     */
    private Integer ecpoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    private Integer ectype;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 员工编号
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 员工编号
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 奖罚日期
     */
    public Date getEcdate() {
        return ecdate;
    }

    /**
     * 奖罚日期
     */
    public void setEcdate(Date ecdate) {
        this.ecdate = ecdate;
    }

    /**
     * 奖罚原因
     */
    public String getEcreason() {
        return ecreason;
    }

    /**
     * 奖罚原因
     */
    public void setEcreason(String ecreason) {
        this.ecreason = ecreason;
    }

    /**
     * 奖罚分
     */
    public Integer getEcpoint() {
        return ecpoint;
    }

    /**
     * 奖罚分
     */
    public void setEcpoint(Integer ecpoint) {
        this.ecpoint = ecpoint;
    }

    /**
     * 奖罚类别，0：奖，1：罚
     */
    public Integer getEctype() {
        return ectype;
    }

    /**
     * 奖罚类别，0：奖，1：罚
     */
    public void setEctype(Integer ectype) {
        this.ectype = ectype;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employeeec other = (Employeeec) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getEcdate() == null ? other.getEcdate() == null : this.getEcdate().equals(other.getEcdate()))
            && (this.getEcreason() == null ? other.getEcreason() == null : this.getEcreason().equals(other.getEcreason()))
            && (this.getEcpoint() == null ? other.getEcpoint() == null : this.getEcpoint().equals(other.getEcpoint()))
            && (this.getEctype() == null ? other.getEctype() == null : this.getEctype().equals(other.getEctype()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getEcdate() == null) ? 0 : getEcdate().hashCode());
        result = prime * result + ((getEcreason() == null) ? 0 : getEcreason().hashCode());
        result = prime * result + ((getEcpoint() == null) ? 0 : getEcpoint().hashCode());
        result = prime * result + ((getEctype() == null) ? 0 : getEctype().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", eid=").append(eid);
        sb.append(", ecdate=").append(ecdate);
        sb.append(", ecreason=").append(ecreason);
        sb.append(", ecpoint=").append(ecpoint);
        sb.append(", ectype=").append(ectype);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}