package com.example.Proyect_Beta.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;

    @Column(unique = true,nullable = false, length = 40)
    private String correo;
    @Column(nullable = false, length = 40)
    private String nombre;

    @Column()
    private String rol;




    public Empleado()
    {
    }

    public Empleado(long idEmpleado, String correo, String nombre, String correo1, String rol) {
        this.idEmpleado = idEmpleado;
        this.correo = correo;
        this.nombre = nombre;
        this.correo = correo1;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}// fin clase Empleado






}
