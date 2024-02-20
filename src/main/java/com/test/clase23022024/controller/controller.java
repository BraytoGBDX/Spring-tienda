package com.test.clase23022024.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.clase23022024.model.clientesModel;
import com.test.clase23022024.model.empleadosModel;
import com.test.clase23022024.model.productosModel;
import com.test.clase23022024.model.proveedoresModel;
import com.test.clase23022024.model.ventasModel;



@Controller
public class controller {


@GetMapping("/tienda")
public String primeraVista(Model model ) {
    return "index";
}

@GetMapping("/tienda/proovedores")
public String vistraProovedores(Model model ) {

    List<proveedoresModel> listaProveedores = new ArrayList<>();

        listaProveedores.add(new proveedoresModel(1, "Jazziel Rodriguez", "10AM-5PM", "Marinela", "Xicotepec", "1234567895"));
        listaProveedores.add(new proveedoresModel(2, "Brayan Roberto",  "10AM-5PM", "Bimbo","Xicotepec", "1234567898"));
        listaProveedores.add(new proveedoresModel(3, "Pedro Pablo",  "10AM-5PM", "Bimbo", "Xicotepec", "7894561235"));
        
        model.addAttribute("proovedores", listaProveedores);


    return "proovedores";
}

@GetMapping("/tienda/productos")
public String vistaProductos(Model model ) {

    List<productosModel> listaProductos = new ArrayList<>();

        listaProductos.add(new productosModel(1, "Barritas", 10.0, 20.0, "Galleta", "Pepe´s"));
        listaProductos.add(new productosModel(2, "Kikis", 15.0, 25.0, "Fritura", "Pepe´s"));
        listaProductos.add(new productosModel(3, "Frituras", 12.0, 22.0, "Fritura", "Pepe´s"));


    model.addAttribute("productos", listaProductos);
    return "productos";
}



@GetMapping("/tienda/empleados")
public String vistaEmpleados(Model model ) {

    List<empleadosModel> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new empleadosModel(1, "Jazziel", "Rodriguez", "Lopez", "10AM-6PM", "Director General"));
        listaEmpleados.add(new empleadosModel(2, "Brayan",  "Garcia", "Bernabe","10AM-6PM", "Gato"));
        listaEmpleados.add(new empleadosModel(3, "Pedro ",  "Pablo", "Suazo", "10AM-6PM", "Conserje"));
        
        model.addAttribute("empleados", listaEmpleados);

    return "empleados";
}

@GetMapping("/tienda/clientes")
public String vistaClientes(Model model ) {
    List<clientesModel> listaClientes = new ArrayList<>();

    listaClientes.add(new clientesModel(1, "Jazziel", "Rodriguez", "Lopez", "Xicotepec", "4561237896"));
    listaClientes.add(new clientesModel(2, "Brayan",  "Garcia", "Bernabe","La Ceiba", "4567891594"));
    listaClientes.add(new clientesModel(3, "Pedro ",  "Pablo", "Suazo", "Ahuaxintitla", "4531267895"));
    
    model.addAttribute("clientes", listaClientes);
return "clientes";
}

@GetMapping("/tienda/ventas")
public String vistaVentas(Model model ) {
    List<ventasModel> listaVentas = new ArrayList<>();

    listaVentas.add(new ventasModel(1, "22/06/24", 1, 1, 20, "Pepe´s"));
    listaVentas.add(new ventasModel(2, "22/06/24", 2, 1, 20, "Pepe´s"));
    listaVentas.add(new ventasModel(3, "22/06/24", 2, 2, 20, "Pepe´s"));


model.addAttribute("ventas", listaVentas);
    return "ventas";
}

}
