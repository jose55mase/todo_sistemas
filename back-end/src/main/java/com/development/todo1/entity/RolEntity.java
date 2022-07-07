package com.development.todo1.entity;


import javax.persistence.*;

@Entity
@Table(name = "ROL")
@Access(AccessType.FIELD)
public class RolEntity extends ParentEntity{
    private static final long serialVersionUID = 8435405591663518471L;

    /**
     * <h1>Objeto Roles</h1>
     * Ser crea un objeto de tipo Rol para almacenar los permisos de los usuario
     * permitiendo una lista de Roles durante la creacion de un nuevo usuario.
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

    @Column(name = "STATE")
    private Boolean state;

    public RolEntity( String name, Boolean state) {

        this.name = name;
        this.state = state;
    }

    public RolEntity( ) {

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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "RolEntity{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}