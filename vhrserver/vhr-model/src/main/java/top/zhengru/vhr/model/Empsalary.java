package top.zhengru.vhr.model;

import java.io.Serializable;

/**
 * 
 * @TableName empsalary
 */
public class Empsalary implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer eid;

    /**
     * 
     */
    private Integer sid;

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
     * 
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 
     */
    public void setSid(Integer sid) {
        this.sid = sid;
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
        Empsalary other = (Empsalary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
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
        sb.append(", sid=").append(sid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}