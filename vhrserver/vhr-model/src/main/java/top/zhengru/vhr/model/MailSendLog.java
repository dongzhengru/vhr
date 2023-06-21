package top.zhengru.vhr.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName mail_send_log
 */
public class MailSendLog implements Serializable {
    /**
     * 
     */
    private String msgid;

    /**
     * 
     */
    private Integer empid;

    /**
     * 0发送中，1发送成功，2发送失败
     */
    private Integer status;

    /**
     * 
     */
    private String routekey;

    /**
     * 
     */
    private String exchange;

    /**
     * 重试次数
     */
    private Integer count;

    /**
     * 第一次重试时间
     */
    private Date trytime;

    /**
     * 
     */
    private Date createtime;

    /**
     * 
     */
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getMsgid() {
        return msgid;
    }

    /**
     * 
     */
    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    /**
     * 
     */
    public Integer getEmpid() {
        return empid;
    }

    /**
     * 
     */
    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    /**
     * 0发送中，1发送成功，2发送失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0发送中，1发送成功，2发送失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     */
    public String getRoutekey() {
        return routekey;
    }

    /**
     * 
     */
    public void setRoutekey(String routekey) {
        this.routekey = routekey;
    }

    /**
     * 
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * 
     */
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * 重试次数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 重试次数
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 第一次重试时间
     */
    public Date getTrytime() {
        return trytime;
    }

    /**
     * 第一次重试时间
     */
    public void setTrytime(Date trytime) {
        this.trytime = trytime;
    }

    /**
     * 
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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
        MailSendLog other = (MailSendLog) that;
        return (this.getMsgid() == null ? other.getMsgid() == null : this.getMsgid().equals(other.getMsgid()))
            && (this.getEmpid() == null ? other.getEmpid() == null : this.getEmpid().equals(other.getEmpid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRoutekey() == null ? other.getRoutekey() == null : this.getRoutekey().equals(other.getRoutekey()))
            && (this.getExchange() == null ? other.getExchange() == null : this.getExchange().equals(other.getExchange()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getTrytime() == null ? other.getTrytime() == null : this.getTrytime().equals(other.getTrytime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMsgid() == null) ? 0 : getMsgid().hashCode());
        result = prime * result + ((getEmpid() == null) ? 0 : getEmpid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRoutekey() == null) ? 0 : getRoutekey().hashCode());
        result = prime * result + ((getExchange() == null) ? 0 : getExchange().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getTrytime() == null) ? 0 : getTrytime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", msgid=").append(msgid);
        sb.append(", empid=").append(empid);
        sb.append(", status=").append(status);
        sb.append(", routekey=").append(routekey);
        sb.append(", exchange=").append(exchange);
        sb.append(", count=").append(count);
        sb.append(", trytime=").append(trytime);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}