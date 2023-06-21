package top.zhengru.vhr.model;

import java.io.Serializable;

/**
 * 
 * @TableName hr_role
 */
public class HrRole implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer hrid;

    /**
     * 
     */
    private Integer rid;

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
    public Integer getHrid() {
        return hrid;
    }

    /**
     * 
     */
    public void setHrid(Integer hrid) {
        this.hrid = hrid;
    }

    /**
     * 
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 
     */
    public void setRid(Integer rid) {
        this.rid = rid;
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
        HrRole other = (HrRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHrid() == null ? other.getHrid() == null : this.getHrid().equals(other.getHrid()))
            && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHrid() == null) ? 0 : getHrid().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hrid=").append(hrid);
        sb.append(", rid=").append(rid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}