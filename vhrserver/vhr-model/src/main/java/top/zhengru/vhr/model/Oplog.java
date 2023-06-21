package top.zhengru.vhr.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName oplog
 */
public class Oplog implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 添加日期
     */
    private Date adddate;

    /**
     * 操作内容
     */
    private String operate;

    /**
     * 操作员ID
     */
    private Integer hrid;

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
     * 添加日期
     */
    public Date getAdddate() {
        return adddate;
    }

    /**
     * 添加日期
     */
    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    /**
     * 操作内容
     */
    public String getOperate() {
        return operate;
    }

    /**
     * 操作内容
     */
    public void setOperate(String operate) {
        this.operate = operate;
    }

    /**
     * 操作员ID
     */
    public Integer getHrid() {
        return hrid;
    }

    /**
     * 操作员ID
     */
    public void setHrid(Integer hrid) {
        this.hrid = hrid;
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
        Oplog other = (Oplog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdddate() == null ? other.getAdddate() == null : this.getAdddate().equals(other.getAdddate()))
            && (this.getOperate() == null ? other.getOperate() == null : this.getOperate().equals(other.getOperate()))
            && (this.getHrid() == null ? other.getHrid() == null : this.getHrid().equals(other.getHrid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdddate() == null) ? 0 : getAdddate().hashCode());
        result = prime * result + ((getOperate() == null) ? 0 : getOperate().hashCode());
        result = prime * result + ((getHrid() == null) ? 0 : getHrid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adddate=").append(adddate);
        sb.append(", operate=").append(operate);
        sb.append(", hrid=").append(hrid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}