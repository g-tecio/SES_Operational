package com.cwgx.newhorizon.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "stock_item")
public class StockItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer stock_item_id;

    private Integer item_id;

    private Integer specs_id;

    private Integer item_inventory_id;

    private Integer treatment_id;

    private String pickup_type;

    private Date sale_date;

    private boolean security_required;

    private boolean fragile_flag;

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Integer getSpecs_id() {
        return specs_id;
    }

    public void setSpecs_id(Integer specs_id) {
        this.specs_id = specs_id;
    }

    public Integer getItem_inventory_id() {
        return item_inventory_id;
    }

    public void setItem_inventory_id(Integer item_inventory_id) {
        this.item_inventory_id = item_inventory_id;
    }

    public Integer getTreatment_id() {
        return treatment_id;
    }

    public void setTreatment_id(Integer treatment_id) {
        this.treatment_id = treatment_id;
    }

    public String getPickup_type() {
        return pickup_type;
    }

    public void setPickup_type(String pickup_type) {
        this.pickup_type = pickup_type;
    }

    public Date getSale_date() {
        return sale_date;
    }

    public void setSale_date(Date sale_date) {
        this.sale_date = sale_date;
    }

    public boolean isSecurity_required() {
        return security_required;
    }

    public void setSecurity_required(boolean security_required) {
        this.security_required = security_required;
    }

    public boolean isFragile_flag() {
        return fragile_flag;
    }

    public void setFragile_flag(boolean fragile_flag) {
        this.fragile_flag = fragile_flag;
    }

    public Integer getStock_item_id() {
        return stock_item_id;
    }

    public void setStock_item_id(Integer stock_item_id) {
        this.stock_item_id = stock_item_id;
    }
}
