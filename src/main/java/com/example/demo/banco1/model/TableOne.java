package com.example.demo.banco1.model;

import javax.persistence.*;

@Entity
@Table(name = "TABLE_ONE")
public class TableOne {

    @Id
    @Column(name = "CO_CODIGO")
    private Long id;

    @Column(name = "NO_NOME")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
