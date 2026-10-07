package com.tecnm.merida.market_backend.persistence;

import com.tecnm.merida.market_backend.domain.Product;
import com.tecnm.merida.market_backend.persistence.crud.ProductoCrudRepository;
import com.tecnm.merida.market_backend.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    //SELECT * FROM productos
    public List<Producto> getAll(){

        //vamos a "castear"
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategory(int idCategoria){
        return productoCrudRepository.findByCategoriaOrderByNombreAsc(idCategoria);

    }
    public <List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThenAndEstado(cantidad, estado: true);
    }

    public Optional<Producto> getProducto(int idProducto){
        return;productoCrudRepository.findBy(idProducto);
    }

    Public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }
    public void delete(int idProducto){
        productoCrudRepository.deleteBy(idProducto);
    }
}

/
