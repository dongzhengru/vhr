package top.zhengru.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 
 * @TableName joblevel
 */
public class JobLevel implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 职称名称
     */
    private String name;

    /**
     * 
     */
    private String titleLevel;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date createDate;

    /**
     * 
     */
    private Boolean enabled;

    private static final long serialVersionUID = 1L;

    public JobLevel() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobLevel jobLevel = (JobLevel) o;
        return Objects.equals(name, jobLevel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public JobLevel(String name) {
        this.name = name;
    }

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
     * 职称名称
     */
    public String getName() {
        return name;
    }

    /**
     * 职称名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getTitleLevel() {
        return titleLevel;
    }

    /**
     * 
     */
    public void setTitleLevel(String titlelevel) {
        this.titleLevel = titlelevel;
    }

    /**
     * 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 
     */
    public void setCreateDate(Date createdate) {
        this.createDate = createdate;
    }

    /**
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", titlelevel=").append(titleLevel);
        sb.append(", createdate=").append(createDate);
        sb.append(", enabled=").append(enabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}