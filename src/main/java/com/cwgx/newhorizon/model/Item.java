package com.cwgx.newhorizon.model;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_item;
    private Integer category_id;
    @Length(min=5, max=45)
    private String name;
    @Length(min=5, max=45)
    private String description;
    private Float taxable_value;
    private String status;
    private Integer tax_exempt_code;

    public Integer getId_Item() {
        return id_item;
    }
    public void setId_Item(Integer id_Item) {
        this.id_item = id_Item;
    }
    public Integer getCategory_id() {
        return category_id;
    }
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Float getTaxable_value() {
        return taxable_value;
    }
    public void setTaxable_value(Float taxable_value) {
        this.taxable_value = taxable_value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTax_exempt_code() {
        return tax_exempt_code;
    }

    public void setTax_exempt_code(Integer tax_exempt_code) {
        this.tax_exempt_code = tax_exempt_code;
    }

}
