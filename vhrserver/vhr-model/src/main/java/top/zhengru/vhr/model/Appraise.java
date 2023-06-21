package top.zhengru.vhr.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName appraise
 */
public class Appraise implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer eid;

    /**
     * 考评日期
     */
    private Date appdate;

    /**
     * 考评结果
     */
    private String appresult;

    /**
     * 考评内容
     */
    private String appcontent;

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
     * 考评日期
     */
    public Date getAppdate() {
        return appdate;
    }

    /**
     * 考评日期
     */
    public void setAppdate(Date appdate) {
        this.appdate = appdate;
    }

    /**
     * 考评结果
     */
    public String getAppresult() {
        return appresult;
    }

    /**
     * 考评结果
     */
    public void setAppresult(String appresult) {
        this.appresult = appresult;
    }

    /**
     * 考评内容
     */
    public String getAppcontent() {
        return appcontent;
    }

    /**
     * 考评内容
     */
    public void setAppcontent(String appcontent) {
        this.appcontent = appcontent;
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
        Appraise other = (Appraise) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getAppdate() == null ? other.getAppdate() == null : this.getAppdate().equals(other.getAppdate()))
            && (this.getAppresult() == null ? other.getAppresult() == null : this.getAppresult().equals(other.getAppresult()))
            && (this.getAppcontent() == null ? other.getAppcontent() == null : this.getAppcontent().equals(other.getAppcontent()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getAppdate() == null) ? 0 : getAppdate().hashCode());
        result = prime * result + ((getAppresult() == null) ? 0 : getAppresult().hashCode());
        result = prime * result + ((getAppcontent() == null) ? 0 : getAppcontent().hashCode());
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
        sb.append(", appdate=").append(appdate);
        sb.append(", appresult=").append(appresult);
        sb.append(", appcontent=").append(appcontent);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}