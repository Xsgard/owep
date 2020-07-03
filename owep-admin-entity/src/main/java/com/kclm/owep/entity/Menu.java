package com.kclm.owep.entity;

import java.util.Date;

public class Menu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.fk_parent_id
     *
     * @mbg.generated
     */
    private Integer fkParentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.menu_name
     *
     * @mbg.generated
     */
    private String menuName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.menu_url
     *
     * @mbg.generated
     */
    private String menuUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.menu_description
     *
     * @mbg.generated
     */
    private String menuDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.menu_code
     *
     * @mbg.generated
     */
    private String menuCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.last_access_time
     *
     * @mbg.generated
     */
    private Date lastAccessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.id
     *
     * @return the value of t_menu.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.id
     *
     * @param id the value for t_menu.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.fk_parent_id
     *
     * @return the value of t_menu.fk_parent_id
     *
     * @mbg.generated
     */
    public Integer getFkParentId() {
        return fkParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.fk_parent_id
     *
     * @param fkParentId the value for t_menu.fk_parent_id
     *
     * @mbg.generated
     */
    public void setFkParentId(Integer fkParentId) {
        this.fkParentId = fkParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.menu_name
     *
     * @return the value of t_menu.menu_name
     *
     * @mbg.generated
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.menu_name
     *
     * @param menuName the value for t_menu.menu_name
     *
     * @mbg.generated
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.menu_url
     *
     * @return the value of t_menu.menu_url
     *
     * @mbg.generated
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.menu_url
     *
     * @param menuUrl the value for t_menu.menu_url
     *
     * @mbg.generated
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.menu_description
     *
     * @return the value of t_menu.menu_description
     *
     * @mbg.generated
     */
    public String getMenuDescription() {
        return menuDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.menu_description
     *
     * @param menuDescription the value for t_menu.menu_description
     *
     * @mbg.generated
     */
    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription == null ? null : menuDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.menu_code
     *
     * @return the value of t_menu.menu_code
     *
     * @mbg.generated
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.menu_code
     *
     * @param menuCode the value for t_menu.menu_code
     *
     * @mbg.generated
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.create_time
     *
     * @return the value of t_menu.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.create_time
     *
     * @param createTime the value for t_menu.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.last_access_time
     *
     * @return the value of t_menu.last_access_time
     *
     * @mbg.generated
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.last_access_time
     *
     * @param lastAccessTime the value for t_menu.last_access_time
     *
     * @mbg.generated
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.version
     *
     * @return the value of t_menu.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.version
     *
     * @param version the value for t_menu.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}