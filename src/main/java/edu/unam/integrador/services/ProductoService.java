package edu.unam.integrador.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unam.integrador.model.Producto;
import edu.unam.integrador.repositories.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    //Mostrar un producto
    public Optional<Producto> getProducto(Long id){
        return productoRepository.findById(id);
    }
    
    //Mostrar productos
    public ArrayList<Producto> getAllProductos(){
        List<Producto> lista = productoRepository.findAll();
        ArrayList<Producto> listaProductos = new ArrayList<Producto>(lista);
        return listaProductos;
    }

    //Crear producto - Recibe Producto sin ID asignado. Se encarga el GeneratedValue
    public Producto createProducto(Producto producto){
        return productoRepository.save(producto);
    }

    //Editar producto - Recibe Producto con un ID asignado
    public Producto updateProducto(Producto producto){
        return productoRepository.save(producto);
    }

    //Eliminar Producto
    public void deleteProductoById(Long id){
        productoRepository.deleteById(id);
    }
}
