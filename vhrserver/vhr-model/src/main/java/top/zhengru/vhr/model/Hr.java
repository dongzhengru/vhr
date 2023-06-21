package top.zhengru.vhr.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @TableName hr
 */
public class Hr implements UserDetails {
    /**
     * hrID
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 住宅电话
     */
    private String telephone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 
     */
    private Boolean enabled;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 
     */
    private String userface;

    /**
     * 
     */
    private String remark;

    private List<Role> roles;

    private static final long serialVersionUID = 1L;

    /**
     * hrID
     */
    public Integer getId() {
        return id;
    }

    /**
     * hrID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 住宅电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 住宅电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 联系地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 联系地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

//    /**
//     *
//     */
//    public Integer getEnabled() {
//        return enabled;
//    }

    /**
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 用户名
     */
    public String getUsername() {
        return username;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>(roles.size());
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     */
    public String getUserface() {
        return userface;
    }

    /**
     * 
     */
    public void setUserface(String userface) {
        this.userface = userface;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hr hr = (Hr) o;
        return Objects.equals(id, hr.id) && Objects.equals(name, hr.name) && Objects.equals(phone, hr.phone) && Objects.equals(telephone, hr.telephone) && Objects.equals(address, hr.address) && Objects.equals(enabled, hr.enabled) && Objects.equals(username, hr.username) && Objects.equals(password, hr.password) && Objects.equals(userface, hr.userface) && Objects.equals(remark, hr.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, telephone, address, enabled, username, password, userface, remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", telephone=").append(telephone);
        sb.append(", address=").append(address);
        sb.append(", enabled=").append(enabled);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", userface=").append(userface);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}