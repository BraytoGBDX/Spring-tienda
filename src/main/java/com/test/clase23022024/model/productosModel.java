package com.test.clase23022024.model;

public class productosModel {
    private int codigoProducto;
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private String categoria;
    private String proveedor;

    

    // Constructor
    public productosModel(int codigoProducto, String nombre, double precioCompra, double precioVenta, String categoria, String proveedor) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }

    public int getCodigoProducto() {
        return this.codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return this.precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
