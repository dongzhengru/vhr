package top.zhengru.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName salary
 */
public class Salary implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 基本工资
     */
    private Integer basicSalary;

    /**
     * 奖金
     */
    private Integer bonus;

    /**
     * 午餐补助
     */
    private Integer lunchSalary;

    /**
     * 交通补助
     */
    private Integer trafficSalary;

    /**
     * 应发工资
     */
    private Integer allSalary;

    /**
     * 养老金基数
     */
    private Integer pensionBase;

    /**
     * 养老金比率
     */
    private Float pensionPer;

    /**
     * 启用时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    /**
     * 医疗基数
     */
    private Integer medicalBase;

    /**
     * 医疗保险比率
     */
    private Float medicalPer;

    /**
     * 公积金基数
     */
    private Integer accumulationFundBase;

    /**
     * 公积金比率
     */
    private Float accumulationFundPer;

    /**
     * 
     */
    private String name;

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
     * 基本工资
     */
    public Integer getBasicSalary() {
        return basicSalary;
    }

    /**
     * 基本工资
     */
    public void setBasicSalary(Integer basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * 奖金
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 奖金
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 午餐补助
     */
    public Integer getLunchSalary() {
        return lunchSalary;
    }

    /**
     * 午餐补助
     */
    public void setLunchSalary(Integer lunchSalary) {
        this.lunchSalary = lunchSalary;
    }

    /**
     * 交通补助
     */
    public Integer getTrafficSalary() {
        return trafficSalary;
    }

    /**
     * 交通补助
     */
    public void setTrafficSalary(Integer trafficSalary) {
        this.trafficSalary = trafficSalary;
    }

    /**
     * 应发工资
     */
    public Integer getAllSalary() {
        return allSalary;
    }

    /**
     * 应发工资
     */
    public void setAllSalary(Integer allSalary) {
        this.allSalary = allSalary;
    }

    /**
     * 养老金基数
     */
    public Integer getPensionBase() {
        return pensionBase;
    }

    /**
     * 养老金基数
     */
    public void setPensionBase(Integer pensionBase) {
        this.pensionBase = pensionBase;
    }

    /**
     * 养老金比率
     */
    public Float getPensionPer() {
        return pensionPer;
    }

    /**
     * 养老金比率
     */
    public void setPensionPer(Float pensionPer) {
        this.pensionPer = pensionPer;
    }

    /**
     * 启用时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 启用时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 医疗基数
     */
    public Integer getMedicalBase() {
        return medicalBase;
    }

    /**
     * 医疗基数
     */
    public void setMedicalBase(Integer medicalBase) {
        this.medicalBase = medicalBase;
    }

    /**
     * 医疗保险比率
     */
    public Float getMedicalPer() {
        return medicalPer;
    }

    /**
     * 医疗保险比率
     */
    public void setMedicalPer(Float medicalPer) {
        this.medicalPer = medicalPer;
    }

    /**
     * 公积金基数
     */
    public Integer getAccumulationFundBase() {
        return accumulationFundBase;
    }

    /**
     * 公积金基数
     */
    public void setAccumulationFundBase(Integer accumulationFundBase) {
        this.accumulationFundBase = accumulationFundBase;
    }

    /**
     * 公积金比率
     */
    public Float getAccumulationFundPer() {
        return accumulationFundPer;
    }

    /**
     * 公积金比率
     */
    public void setAccumulationFundPer(Float accumulationFundPer) {
        this.accumulationFundPer = accumulationFundPer;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
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
        Salary other = (Salary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBasicSalary() == null ? other.getBasicSalary() == null : this.getBasicSalary().equals(other.getBasicSalary()))
            && (this.getBonus() == null ? other.getBonus() == null : this.getBonus().equals(other.getBonus()))
            && (this.getLunchSalary() == null ? other.getLunchSalary() == null : this.getLunchSalary().equals(other.getLunchSalary()))
            && (this.getTrafficSalary() == null ? other.getTrafficSalary() == null : this.getTrafficSalary().equals(other.getTrafficSalary()))
            && (this.getAllSalary() == null ? other.getAllSalary() == null : this.getAllSalary().equals(other.getAllSalary()))
            && (this.getPensionBase() == null ? other.getPensionBase() == null : this.getPensionBase().equals(other.getPensionBase()))
            && (this.getPensionPer() == null ? other.getPensionPer() == null : this.getPensionPer().equals(other.getPensionPer()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getMedicalBase() == null ? other.getMedicalBase() == null : this.getMedicalBase().equals(other.getMedicalBase()))
            && (this.getMedicalPer() == null ? other.getMedicalPer() == null : this.getMedicalPer().equals(other.getMedicalPer()))
            && (this.getAccumulationFundBase() == null ? other.getAccumulationFundBase() == null : this.getAccumulationFundBase().equals(other.getAccumulationFundBase()))
            && (this.getAccumulationFundPer() == null ? other.getAccumulationFundPer() == null : this.getAccumulationFundPer().equals(other.getAccumulationFundPer()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBasicSalary() == null) ? 0 : getBasicSalary().hashCode());
        result = prime * result + ((getBonus() == null) ? 0 : getBonus().hashCode());
        result = prime * result + ((getLunchSalary() == null) ? 0 : getLunchSalary().hashCode());
        result = prime * result + ((getTrafficSalary() == null) ? 0 : getTrafficSalary().hashCode());
        result = prime * result + ((getAllSalary() == null) ? 0 : getAllSalary().hashCode());
        result = prime * result + ((getPensionBase() == null) ? 0 : getPensionBase().hashCode());
        result = prime * result + ((getPensionPer() == null) ? 0 : getPensionPer().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getMedicalBase() == null) ? 0 : getMedicalBase().hashCode());
        result = prime * result + ((getMedicalPer() == null) ? 0 : getMedicalPer().hashCode());
        result = prime * result + ((getAccumulationFundBase() == null) ? 0 : getAccumulationFundBase().hashCode());
        result = prime * result + ((getAccumulationFundPer() == null) ? 0 : getAccumulationFundPer().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", basicsalary=").append(basicSalary);
        sb.append(", bonus=").append(bonus);
        sb.append(", lunchsalary=").append(lunchSalary);
        sb.append(", trafficsalary=").append(trafficSalary);
        sb.append(", allsalary=").append(allSalary);
        sb.append(", pensionbase=").append(pensionBase);
        sb.append(", pensionper=").append(pensionPer);
        sb.append(", createdate=").append(createDate);
        sb.append(", medicalbase=").append(medicalBase);
        sb.append(", medicalper=").append(medicalPer);
        sb.append(", accumulationfundbase=").append(accumulationFundBase);
        sb.append(", accumulationfundper=").append(accumulationFundPer);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}