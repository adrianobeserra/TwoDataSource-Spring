package com.example.demo.banco2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE_TWO")
public class TableTwo {

    @Id
    @Column(name = "CO_CODIGO")
    private Long id;

    @Column(name = "NO_NOME")
    private String name;
    
}
