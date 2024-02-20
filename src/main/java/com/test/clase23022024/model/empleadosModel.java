package com.test.clase23022024.model;

public class empleadosModel {
    private int codigoEmpleado;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String horario;
    private String puesto;

    

    // Constructor
    public empleadosModel(int codigoEmpleado, String nombre, String apPaterno, String apMaterno, String horario, String puesto) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.horario = horario;
        this.puesto= puesto;
    }


    public int getCodigoEmpleado() {
        return this.codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return this.apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return this.apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }




}
