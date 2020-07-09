package com.kclm.owep.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/*******
 * @Author yangwr
 * @Version v1.0
 * @Create 2020/7/6 16:34
 * @Description 组织机构实体类
 */
public class OrgInstitute implements Serializable {

    private static final long serialVersionUID = 1L;

    /***
     * 组织机构id
     */
    private Integer id;
    /***
     * 机构名称
     */
    private String instituteName;
    /***
     *机构类型
     */
    private Integer instituteType;
    /***
     *是否逻辑删除，1表示未删除，0表示已删除
     */
    private Integer delete;
    /***
     *版本
     */
    private Integer version = 1;
    /***
     *创建时间
     */
    private LocalDateTime createTime = LocalDateTime.now();
    /***
     *最后访问时间
     */
    private LocalDateTime lastAccessTime = LocalDateTime.now();

    public OrgInstitute() {
    }

    @Override
    public String toString() {
        return "OrgInstitute{" +
                "id=" + id +
                ", instituteName='" + instituteName + '\'' +
                ", instituteType=" + instituteType +
                ", delete=" + delete +
                ", version=" + version +
                ", createTime=" + createTime +
                ", lastAccessTime=" + lastAccessTime +
                '}';
    }

    public OrgInstitute(Integer id, String instituteName, Integer instituteType, Integer delete, Integer version, LocalDateTime createTime, LocalDateTime lastAccessTime) {
        this.id = id;
        this.instituteName = instituteName;
        this.instituteType = instituteType;
        this.delete = delete;
        this.version = version;
        this.createTime = createTime;
        this.lastAccessTime = lastAccessTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgInstitute that = (OrgInstitute) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(instituteName, that.instituteName) &&
                Objects.equals(instituteType, that.instituteType) &&
                Objects.equals(delete, that.delete) &&
                Objects.equals(version, that.version) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(lastAccessTime, that.lastAccessTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instituteName, instituteType, delete, version, createTime, lastAccessTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public Integer getInstituteType() {
        return instituteType;
    }

    public void setInstituteType(Integer instituteType) {
        this.instituteType = instituteType;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(LocalDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }
}