package com.development.todo1.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BILL")
@Access(AccessType.FIELD)
public class BillEntity extends ParentEntity {
    private static final long serialVersionUID = 8435405591663518471L;

    /**
     * <h1>Objeto Facuras</h1>
     * objeto de tipo Factura para almacenar compras de los usuarios
     * permitiendo una lista de informes durante las compras.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-06-01
     */

    @Id
    @Column(name = "CODE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "IDUSER")
    private Long idUser;

    @Column(name = "IDPRODUCT")
    private Long idProduct;

    @Column(name = "PRICE")
    private  Float price;

    @Column(name = "DATE")
    private LocalDate date;

    public BillEntity(Long code, String description, Long amount, Long idUser, LocalDate date) {
        this.code = code;
        this.description = description;
        this.amount = amount;
        this.idUser = idUser;
        this.date = date;
    }

    public BillEntity() {
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return price;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
}
