package com.cwgx.newhorizon.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "item_image")
public class ItemImage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_Item_image;
    private Integer item_id;
    @Length(min=5, max=45)
    private String source;
    private String created_at;
    @Length(min=5, max=45)
    private String status;

    public Integer getId_Item_iamge() {
        return id_Item_image;
    }
    public void setId_Item_iamge(Integer id_Item_iamge) {
        this.id_Item_image = id_Item_iamge;
    }
    public Integer getItem_id() {
        return item_id;
    }
    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
