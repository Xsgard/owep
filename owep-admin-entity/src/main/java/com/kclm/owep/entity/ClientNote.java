package com.kclm.owep.entity;

import java.util.Date;

public class ClientNote {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_note.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_note.fk_client_id
     *
     * @mbg.generated
     */
    private Integer fkClientId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_note.client_state
     *
     * @mbg.generated
     */
    private Integer clientState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_note.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_note.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_note.last_access_time
     *
     * @mbg.generated
     */
    private Date lastAccessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_note.client_note
     *
     * @mbg.generated
     */
    private String clientNote;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_note.id
     *
     * @return the value of t_client_note.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_note.id
     *
     * @param id the value for t_client_note.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_note.fk_client_id
     *
     * @return the value of t_client_note.fk_client_id
     *
     * @mbg.generated
     */
    public Integer getFkClientId() {
        return fkClientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_note.fk_client_id
     *
     * @param fkClientId the value for t_client_note.fk_client_id
     *
     * @mbg.generated
     */
    public void setFkClientId(Integer fkClientId) {
        this.fkClientId = fkClientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_note.client_state
     *
     * @return the value of t_client_note.client_state
     *
     * @mbg.generated
     */
    public Integer getClientState() {
        return clientState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_note.client_state
     *
     * @param clientState the value for t_client_note.client_state
     *
     * @mbg.generated
     */
    public void setClientState(Integer clientState) {
        this.clientState = clientState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_note.create_time
     *
     * @return the value of t_client_note.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_note.create_time
     *
     * @param createTime the value for t_client_note.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_note.version
     *
     * @return the value of t_client_note.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_note.version
     *
     * @param version the value for t_client_note.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_note.last_access_time
     *
     * @return the value of t_client_note.last_access_time
     *
     * @mbg.generated
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_note.last_access_time
     *
     * @param lastAccessTime the value for t_client_note.last_access_time
     *
     * @mbg.generated
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_note.client_note
     *
     * @return the value of t_client_note.client_note
     *
     * @mbg.generated
     */
    public String getClientNote() {
        return clientNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_note.client_note
     *
     * @param clientNote the value for t_client_note.client_note
     *
     * @mbg.generated
     */
    public void setClientNote(String clientNote) {
        this.clientNote = clientNote == null ? null : clientNote.trim();
    }
}