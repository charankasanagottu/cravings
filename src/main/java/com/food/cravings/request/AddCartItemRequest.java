package com.food.cravings.request;

import jakarta.annotation.sql.DataSourceDefinitions;
import lombok.Data;

import java.util.List;

@Data
public class AddCartItemRequest {

    private Long foodId;
    private int quantity;
    private List<String> ingredients;

}