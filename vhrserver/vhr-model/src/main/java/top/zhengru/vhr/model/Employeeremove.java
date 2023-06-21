package top.zhengru.vhr.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName employeeremove
 */
public class Employeeremove implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer eid;

    /**
     * 调动后部门
     */
    private Integer afterdepid;

    /**
     * 调动后职位
     */
    private Integer afterjobid;

    /**
     * 调动日期
     */
    private Date removedate;

    /**
     * 调动原因
     */
    private String reason;

    /**
     * 
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
     * 
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 调动后部门
     */
    public Integer getAfterdepid() {
        return afterdepid;
    }

    /**
     * 调动后部门
     */
    public void setAfterdepid(Integer afterdepid) {
        this.afterdepid = afterdepid;
    }

    /**
     * 调动后职位
     */
    public Integer getAfterjobid() {
        return afterjobid;
    }

    /**
     * 调动后职位
     */
    public void setAfterjobid(Integer afterjobid) {
        this.afterjobid = afterjobid;
    }

    /**
     * 调动日期
     */
    public Date getRemovedate() {
        return removedate;
    }

    /**
     * 调动日期
     */
    public void setRemovedate(Date removedate) {
        this.removedate = removedate;
    }

    /**
     * 调动原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 调动原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
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
        Employeeremove other = (Employeeremove) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getAfterdepid() == null ? other.getAfterdepid() == null : this.getAfterdepid().equals(other.getAfterdepid()))
            && (this.getAfterjobid() == null ? other.getAfterjobid() == null : this.getAfterjobid().equals(other.getAfterjobid()))
            && (this.getRemovedate() == null ? other.getRemovedate() == null : this.getRemovedate().equals(other.getRemovedate()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getAfterdepid() == null) ? 0 : getAfterdepid().hashCode());
        result = prime * result + ((getAfterjobid() == null) ? 0 : getAfterjobid().hashCode());
        result = prime * result + ((getRemovedate() == null) ? 0 : getRemovedate().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
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
        sb.append(", afterdepid=").append(afterdepid);
        sb.append(", afterjobid=").append(afterjobid);
        sb.append(", removedate=").append(removedate);
        sb.append(", reason=").append(reason);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}