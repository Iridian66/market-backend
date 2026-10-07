package com.tecnm.merida.market_backend.persistence.mapper;

import com.tecnm.merida.market_backend.domain.Product;
import com.tecnm.merida.market_backend.persistence.entity.Producto;
import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.Inherited;
import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category"),


    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritedInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true )
    Producto toProducto(Producto producto);
}
