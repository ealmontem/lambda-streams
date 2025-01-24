package com.elvisalmonte.fundamentals;

import java.util.List;

public interface DataBaseService<T> {
    T getById(Long id);
    List<T> getAllProducts();
}
