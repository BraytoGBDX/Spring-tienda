package com.test.clase23022024.model;

public class ventasModel {
    private int codigoVenta;
    private String fecha;
    private int codEmpleado;
    private int codProducto;
    private double precioProducto;
    private String proveedor;

    

    // Constructor
    public ventasModel(int codigoVenta, String fecha, int codEmpleado, int codProducto, double precioProducto, String proveedor) {
        this.codigoVenta = codigoVenta;
        this.fecha = fecha;
        this.codEmpleado = codEmpleado;
        this.codProducto = codProducto;
        this.precioProducto = precioProducto;
        this.proveedor = proveedor;
    }


    public int getCodigoVenta() {
        return this.codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodEmpleado() {
        return this.codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public int getCodProducto() {
        return this.codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public double getPrecioProducto() {
        return this.precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }



}
