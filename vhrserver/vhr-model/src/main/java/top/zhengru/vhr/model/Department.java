package top.zhengru.vhr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @TableName department
 */
public class Department implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 
     */
    private Integer parentId;

    /**
     * 
     */
    private String depPath;

    /**
     * 
     */
    private Boolean enabled;

    /**
     * 
     */
    private Integer isParent;
    private List<Department> children = new ArrayList<>();
    private Integer result;

    public Department() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Department(String name) {
        this.name = name;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public List<Department> getChildren() {
        return children;
    }

    public void setChildren(List<Department> children) {
        this.children = children;
    }

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
     * 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     */
    public String getDepPath() {
        return depPath;
    }

    /**
     * 
     */
    public void setDepPath(String depPath) {
        this.depPath = depPath;
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

    /**
     * 
     */
    public Integer getIsParent() {
        return isParent;
    }

    /**
     * 
     */
    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", depPath=").append(depPath);
        sb.append(", enabled=").append(enabled);
        sb.append(", isParent=").append(isParent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}