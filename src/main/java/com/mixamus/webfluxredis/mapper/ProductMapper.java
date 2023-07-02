package com.mixamus.webfluxredis.mapper;

import com.mixamus.webfluxredis.domain.dto.ProductDto;
import com.mixamus.webfluxredis.domain.entity.Product;

public class ProductMapper {

    public static ProductDto toDto(Product entity) {
        return ProductDto.builder()
                .id(entity.getId())
                .description(entity.getDescription())
                .price(entity.getPrice())
                .qtyAvailable(entity.getQtyAvailable())
                .build();
    }

    public static Product toEntity(ProductDto dto) {
        return Product.builder()
                .id(dto.getId())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .qtyAvailable(dto.getQtyAvailable())
                .build();
    }
}
