package top.zhengru.vhr.model;

import java.io.Serializable;

/**
 * 
 * @TableName sysmsg
 */
public class Sysmsg implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 消息id
     */
    private Integer mid;

    /**
     * 0表示群发消息
     */
    private Integer type;

    /**
     * 这条消息是给谁的
     */
    private Integer hrid;

    /**
     * 0 未读 1 已读
     */
    private Integer state;

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
     * 消息id
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 消息id
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * 0表示群发消息
     */
    public Integer getType() {
        return type;
    }

    /**
     * 0表示群发消息
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 这条消息是给谁的
     */
    public Integer getHrid() {
        return hrid;
    }

    /**
     * 这条消息是给谁的
     */
    public void setHrid(Integer hrid) {
        this.hrid = hrid;
    }

    /**
     * 0 未读 1 已读
     */
    public Integer getState() {
        return state;
    }

    /**
     * 0 未读 1 已读
     */
    public void setState(Integer state) {
        this.state = state;
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
        Sysmsg other = (Sysmsg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getHrid() == null ? other.getHrid() == null : this.getHrid().equals(other.getHrid()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getHrid() == null) ? 0 : getHrid().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mid=").append(mid);
        sb.append(", type=").append(type);
        sb.append(", hrid=").append(hrid);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}