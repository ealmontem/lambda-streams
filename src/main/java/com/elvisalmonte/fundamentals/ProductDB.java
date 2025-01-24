package com.elvisalmonte.fundamentals;

import java.util.List;

public class ProductDB implements DataBaseService<Product>{
    @Override
    public Product getById(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("Galletas");
        product.setPrice(12.3);
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
