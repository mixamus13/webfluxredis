package com.mixamus.webfluxredis.controller;

import com.mixamus.webfluxredis.domain.dto.ProductDto;
import com.mixamus.webfluxredis.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("{id}")
    public Mono<ProductDto> getProduct(@PathVariable Integer id) {
        return productService.getProduct(id);
    }

    @PutMapping("{id}")
    public Mono<Void> updateProduct(@PathVariable Integer id, @RequestBody Mono<ProductDto> productDto) {
        return productService.updateProduct(id, productDto);
    }
}
