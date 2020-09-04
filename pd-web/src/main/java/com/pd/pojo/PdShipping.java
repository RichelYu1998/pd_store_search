package com.pd.pojo;

import java.io.Serializable;
import java.util.Date;

public class PdShipping implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.add_id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Long addId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.user_id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.receiver_name
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String receiverName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.receiver_phone
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String receiverPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.receiver_mobile
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String receiverMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.receiver_state
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String receiverState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.receiver_city
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String receiverCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.receiver_district
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String receiverDistrict;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.receiver_address
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String receiverAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.receiver_zip
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String receiverZip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.created
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.updated
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.status
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_shipping.is_default
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Boolean isDefault;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pd_shipping
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.add_id
     *
     * @return the value of pd_shipping.add_id
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Long getAddId() {
        return addId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.add_id
     *
     * @param addId the value for pd_shipping.add_id
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setAddId(Long addId) {
        this.addId = addId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.user_id
     *
     * @return the value of pd_shipping.user_id
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.user_id
     *
     * @param userId the value for pd_shipping.user_id
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.receiver_name
     *
     * @return the value of pd_shipping.receiver_name
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.receiver_name
     *
     * @param receiverName the value for pd_shipping.receiver_name
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.receiver_phone
     *
     * @return the value of pd_shipping.receiver_phone
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.receiver_phone
     *
     * @param receiverPhone the value for pd_shipping.receiver_phone
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.receiver_mobile
     *
     * @return the value of pd_shipping.receiver_mobile
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.receiver_mobile
     *
     * @param receiverMobile the value for pd_shipping.receiver_mobile
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.receiver_state
     *
     * @return the value of pd_shipping.receiver_state
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getReceiverState() {
        return receiverState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.receiver_state
     *
     * @param receiverState the value for pd_shipping.receiver_state
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState == null ? null : receiverState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.receiver_city
     *
     * @return the value of pd_shipping.receiver_city
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.receiver_city
     *
     * @param receiverCity the value for pd_shipping.receiver_city
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.receiver_district
     *
     * @return the value of pd_shipping.receiver_district
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.receiver_district
     *
     * @param receiverDistrict the value for pd_shipping.receiver_district
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict == null ? null : receiverDistrict.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.receiver_address
     *
     * @return the value of pd_shipping.receiver_address
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.receiver_address
     *
     * @param receiverAddress the value for pd_shipping.receiver_address
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.receiver_zip
     *
     * @return the value of pd_shipping.receiver_zip
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getReceiverZip() {
        return receiverZip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.receiver_zip
     *
     * @param receiverZip the value for pd_shipping.receiver_zip
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip == null ? null : receiverZip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.created
     *
     * @return the value of pd_shipping.created
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.created
     *
     * @param created the value for pd_shipping.created
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.updated
     *
     * @return the value of pd_shipping.updated
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.updated
     *
     * @param updated the value for pd_shipping.updated
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.status
     *
     * @return the value of pd_shipping.status
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.status
     *
     * @param status the value for pd_shipping.status
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_shipping.is_default
     *
     * @return the value of pd_shipping.is_default
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_shipping.is_default
     *
     * @param isDefault the value for pd_shipping.is_default
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_shipping
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addId=").append(addId);
        sb.append(", userId=").append(userId);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverPhone=").append(receiverPhone);
        sb.append(", receiverMobile=").append(receiverMobile);
        sb.append(", receiverState=").append(receiverState);
        sb.append(", receiverCity=").append(receiverCity);
        sb.append(", receiverDistrict=").append(receiverDistrict);
        sb.append(", receiverAddress=").append(receiverAddress);
        sb.append(", receiverZip=").append(receiverZip);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", status=").append(status);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}