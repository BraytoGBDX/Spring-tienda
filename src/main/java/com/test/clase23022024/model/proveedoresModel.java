package com.test.clase23022024.model;

public class proveedoresModel {
    private int codigoProveedor;
    private String nombre;
    private String horario;
    private String empresa;
    private String domicilio;
    private String tel;

    

    // Constructor
    public proveedoresModel(int codigoProovedor, String nombre, String horario, String empresa, String domicilio, String tel) {
        this.codigoProveedor = codigoProovedor;
        this.nombre = nombre;
        this.horario = horario;
        this.empresa = empresa;
        this.domicilio = domicilio;
        this.tel = tel;
    }


    public int getCodigoProveedor() {
        return this.codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }



}