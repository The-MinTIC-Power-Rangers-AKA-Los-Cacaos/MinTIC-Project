package com.proyecto.sistemagestion.entities;

import javax.persistence.*;
@Entity
@Table(name="movimientoDinero")
public class movimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double monto;
    private String concepto;
    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Empleado usuario;

    public movimientoDinero(){

    }

    public movimientoDinero(double monto, String concepto, Empleado usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }
    }
