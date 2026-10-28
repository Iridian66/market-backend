package com.tecnm.merida.market_backend.persistence.crud;
import java.util.List;


import com.tecnm.merida.market_backend.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
//Métodos abstractos que despues se implementaran
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {


    /*SQL Query
    SELECT *
    FROM productos
    WHERE id_categoria =10?
    ORDER BY nombre ASC
     */
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //Cantidad stock
    List<Producto> findByCantidadStockLessThanAndEstado(int CantidadStock, boolean estado);

}