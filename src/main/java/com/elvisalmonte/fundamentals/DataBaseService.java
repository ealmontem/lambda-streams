package com.elvisalmonte.fundamentals;

import java.util.List;

public interface DataBaseService {
    String getById(Long id);
    List<String> getAllProducts();
}
