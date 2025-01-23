package com.elvisalmonte.fundamentals;

import java.util.List;

public class PostgresDB implements DataBaseService{
    @Override
    public String getById(Long id) {
        return "Getting Data From Postgres id:"+id;
    }

    @Override
    public List<String> getAllProducts() {
        return List.of("Hello World From PostgresDB");
    }
}
