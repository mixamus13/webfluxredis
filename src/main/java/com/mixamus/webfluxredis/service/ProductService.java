package com.mixamus.webfluxredis.service;

import com.mixamus.webfluxredis.domain.dto.ProductDto;
import reactor.core.publisher.Mono;


public interface ProductService {

    Mono<ProductDto> getProduct(Integer id);
    Mono<Void> updateProduct(Integer id, Mono<ProductDto> productDto);
}
