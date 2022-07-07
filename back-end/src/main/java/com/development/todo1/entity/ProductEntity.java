package com.development.todo1.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
@Access(AccessType.FIELD)
public class ProductEntity extends ParentEntity{
    private static final long serialVersionUID = 8435405591663518471L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE")
    private Long code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMAGE",length = 4000)
    private String image;

    @Column(name = "AMOUNT")
    private Integer amount;

    @Column(name = "PRICE")
    private Float price;

    @Column(name = "STATE")
    private Boolean state;

    public ProductEntity(String name, String description, String image, Integer amount, Float price, Boolean state) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.amount = amount;
        this.price = price;
        this.state = state;
    }

    public ProductEntity() {
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
