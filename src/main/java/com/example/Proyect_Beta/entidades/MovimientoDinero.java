package com.example.Proyect_Beta.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;


@Entity
@Table(name="MovimientosDinero")

public class MovimientoDinero{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMovimiento;

    @Column(name="monto",nullable = false)
    private double monto;

    @Column(name="concepto",nullable = false, length = 40)
    private String concepto;

    //@Column(unique = true,nullable = false,length = 30,name="empleado")
    //private Empleado empleado;

    @ManyToOne
    @JoinColumn(name="id_empleado",)
    Empleado idEmpleado;


    //CONSTRUCTOR


   //public MovimientoDinero(Empleado id_empleado) {
   //     this.idEmpleado = id_empleado;
   // }

    public MovimientoDinero(int idMovimiento, double monto, String concepto, Empleado empleado) {
        this.idMovimiento = idMovimiento;
        this.monto = monto;
        this.concepto = concepto;
        //this.empleado = empleado;
    }

    public MovimientoDinero() {
    }

    //GET & SET


    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
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

    //public Empleado getEmpleado() {
    //    return empleado;
    //}

    //public void setEmpleado(Empleado empleado) {
    //    this.empleado = empleado;
    //}


    public Empleado getEmp() {
        return idEmpleado;
    }

    public void setEmp(Empleado id_empleado) {
        this.idEmpleado = id_empleado;
    }
}