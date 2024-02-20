package com.test.clase23022024.model;

public class clientesModel {
    private int codigoCliente;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String domicilio;
    private String tel;

    

    // Constructor
    public clientesModel(int codigoCliente, String nombre, String apPaterno, String apMaterno, String domicilio, String tel) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.domicilio = domicilio;
        this.tel= tel;
    }

    public int getCodigoCliente() {
        return this.codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
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
