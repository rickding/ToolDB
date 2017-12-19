package com.rms.db.model;

import java.util.Date;

public class Status {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column status.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column status.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column status.aliases
     *
     * @mbg.generated
     */
    private String aliases;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column status.is_deleted
     *
     * @mbg.generated
     */
    private Boolean isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column status.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column status.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column status.id
     *
     * @return the value of status.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column status.id
     *
     * @param id the value for status.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column status.name
     *
     * @return the value of status.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column status.name
     *
     * @param name the value for status.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column status.aliases
     *
     * @return the value of status.aliases
     *
     * @mbg.generated
     */
    public String getAliases() {
        return aliases;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column status.aliases
     *
     * @param aliases the value for status.aliases
     *
     * @mbg.generated
     */
    public void setAliases(String aliases) {
        this.aliases = aliases == null ? null : aliases.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column status.is_deleted
     *
     * @return the value of status.is_deleted
     *
     * @mbg.generated
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column status.is_deleted
     *
     * @param isDeleted the value for status.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column status.create_time
     *
     * @return the value of status.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column status.create_time
     *
     * @param createTime the value for status.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column status.update_time
     *
     * @return the value of status.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column status.update_time
     *
     * @param updateTime the value for status.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}