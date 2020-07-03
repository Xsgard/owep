package com.kclm.owep.entity;

import java.util.Date;

public class Evaluate {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate.last_access_time
     *
     * @mbg.generated
     */
    private Date lastAccessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate.fk_user_id
     *
     * @mbg.generated
     */
    private Integer fkUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate.fk_student_id
     *
     * @mbg.generated
     */
    private Integer fkStudentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate.student_name
     *
     * @mbg.generated
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate.evaluate_status
     *
     * @mbg.generated
     */
    private Integer evaluateStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_evaluate.evaluate
     *
     * @mbg.generated
     */
    private String evaluate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate.id
     *
     * @return the value of t_evaluate.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate.id
     *
     * @param id the value for t_evaluate.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate.version
     *
     * @return the value of t_evaluate.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate.version
     *
     * @param version the value for t_evaluate.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate.create_time
     *
     * @return the value of t_evaluate.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate.create_time
     *
     * @param createTime the value for t_evaluate.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate.last_access_time
     *
     * @return the value of t_evaluate.last_access_time
     *
     * @mbg.generated
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate.last_access_time
     *
     * @param lastAccessTime the value for t_evaluate.last_access_time
     *
     * @mbg.generated
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate.fk_user_id
     *
     * @return the value of t_evaluate.fk_user_id
     *
     * @mbg.generated
     */
    public Integer getFkUserId() {
        return fkUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate.fk_user_id
     *
     * @param fkUserId the value for t_evaluate.fk_user_id
     *
     * @mbg.generated
     */
    public void setFkUserId(Integer fkUserId) {
        this.fkUserId = fkUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate.fk_student_id
     *
     * @return the value of t_evaluate.fk_student_id
     *
     * @mbg.generated
     */
    public Integer getFkStudentId() {
        return fkStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate.fk_student_id
     *
     * @param fkStudentId the value for t_evaluate.fk_student_id
     *
     * @mbg.generated
     */
    public void setFkStudentId(Integer fkStudentId) {
        this.fkStudentId = fkStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate.student_name
     *
     * @return the value of t_evaluate.student_name
     *
     * @mbg.generated
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate.student_name
     *
     * @param studentName the value for t_evaluate.student_name
     *
     * @mbg.generated
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate.evaluate_status
     *
     * @return the value of t_evaluate.evaluate_status
     *
     * @mbg.generated
     */
    public Integer getEvaluateStatus() {
        return evaluateStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate.evaluate_status
     *
     * @param evaluateStatus the value for t_evaluate.evaluate_status
     *
     * @mbg.generated
     */
    public void setEvaluateStatus(Integer evaluateStatus) {
        this.evaluateStatus = evaluateStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_evaluate.evaluate
     *
     * @return the value of t_evaluate.evaluate
     *
     * @mbg.generated
     */
    public String getEvaluate() {
        return evaluate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_evaluate.evaluate
     *
     * @param evaluate the value for t_evaluate.evaluate
     *
     * @mbg.generated
     */
    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }
}