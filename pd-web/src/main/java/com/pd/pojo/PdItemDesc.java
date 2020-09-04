package com.pd.pojo;

import java.io.Serializable;
import java.util.Date;

public class PdItemDesc implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_desc.item_id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_desc.created
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_desc.updated
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_desc.item_desc
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String itemDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pd_item_desc
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_desc.item_id
     *
     * @return the value of pd_item_desc.item_id
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_desc.item_id
     *
     * @param itemId the value for pd_item_desc.item_id
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_desc.created
     *
     * @return the value of pd_item_desc.created
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_desc.created
     *
     * @param created the value for pd_item_desc.created
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_desc.updated
     *
     * @return the value of pd_item_desc.updated
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_desc.updated
     *
     * @param updated the value for pd_item_desc.updated
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_desc.item_desc
     *
     * @return the value of pd_item_desc.item_desc
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_desc.item_desc
     *
     * @param itemDesc the value for pd_item_desc.item_desc
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_desc
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemId=").append(itemId);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", itemDesc=").append(itemDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}