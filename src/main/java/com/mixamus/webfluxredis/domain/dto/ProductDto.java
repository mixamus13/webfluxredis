package com.mixamus.webfluxredis.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    @Id
    private Integer id;
    private String description;
    private Integer price;
    private Integer qtyAvailable;
}