package com.development.todo1.entity;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Access(AccessType.FIELD)
public class UserEntity extends ParentEntity {
    private static final long serialVersionUID = 8435405591663518471L;

    /**
     * <h1>Objeto Usuarios</h1>
     * Ser crea un objeto de tipo Usuario para almacenar los usuarios
     * permitiendo una lista de usuarios durante.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE")
    private Long code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DOCUMENT")
    private String document;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ROLID")
    private Long rolid;

    @Column(name = "OCCUPATION")
    private String occupation;

    @Column(name = "STATE")
    private boolean state;

    @Column(name = "SALE")
    private Long sale;

    @Column(name = "USER")
    private String user;

    @Column(name = "PASSWORF")
    private String password;


    public UserEntity(String name, String document, String phone, Long rolid, String occupation, boolean state, Long sale, String user, String password) {
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.rolid = rolid;
        this.occupation = occupation;
        this.state = state;
        this.sale = sale;
        this.user = user;
        this.password = password;
    }

    public UserEntity() {
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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getRolid() {
        return rolid;
    }

    public void setRolid(Long rolid) {
        this.rolid = rolid;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Long getSale() {
        return sale;
    }

    public void setSale(Long sale) {
        this.sale = sale;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
