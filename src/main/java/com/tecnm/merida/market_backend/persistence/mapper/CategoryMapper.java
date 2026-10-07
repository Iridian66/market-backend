package com.tecnm.merida.market_backend.persistence.mapper;
import com.tecnm.merida.market_backend.domain.Category;
import com.tecnm.merida.market_backend.persistence.entity.Categoria;


import org.springframework.web.bind.annotation.Mapping;
import org.xmlunit.util.Mapper;

import java.lang.annotation.Inherited;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping (source = "estado", target =  "active")
    })
    Category toCategory(Categoria categoria);

    @InheritedInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Category toCategory(Category category);
}
