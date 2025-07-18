package com.phms.pojo;

import java.util.Date;

public class User {
    private Long id;
    private Integer age;
    private String name;
    private String password;
    private String email;
    private String idCard;
    private String idName;
    private String qualification;
    private String hospitalName;
    private String hospitalAddress;
    private String department;
    private String info;
    private String img;
    private String phone;
    private String address;
    private Date createTime;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * 
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * 
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * 
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id_card
     *
     * @return the value of user.id_card
     *
     * 
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id_card
     *
     * @param idCard the value for user.id_card
     *
     * 
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id_name
     *
     * @return the value of user.id_name
     *
     * 
     */
    public String getIdName() {
        return idName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id_name
     *
     * @param idName the value for user.id_name
     *
     * 
     */
    public void setIdName(String idName) {
        this.idName = idName == null ? null : idName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.qualification
     *
     * @return the value of user.qualification
     *
     * 
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.qualification
     *
     * @param qualification the value for user.qualification
     *
     * 
     */
    public void setQualification(String qualification) {
        this.qualification = qualification == null ? null : qualification.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.hospital_name
     *
     * @return the value of user.hospital_name
     *
     * 
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.hospital_name
     *
     * @param hospitalName the value for user.hospital_name
     *
     * 
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.hospital_address
     *
     * @return the value of user.hospital_address
     *
     * 
     */
    public String getHospitalAddress() {
        return hospitalAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.hospital_address
     *
     * @param hospitalAddress the value for user.hospital_address
     *
     * 
     */
    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress == null ? null : hospitalAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.department
     *
     * @return the value of user.department
     *
     * 
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.department
     *
     * @param department the value for user.department
     *
     * 
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.info
     *
     * @return the value of user.info
     *
     * 
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.info
     *
     * @param info the value for user.info
     *
     * 
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.img
     *
     * @return the value of user.img
     *
     * 
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.img
     *
     * @param img the value for user.img
     *
     * 
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.address
     *
     * @return the value of user.address
     *
     * 
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.address
     *
     * @param address the value for user.address
     *
     * 
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}