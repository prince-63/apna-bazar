package com.learn.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.model.Product;

@Repository
public class ProductRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Product> getAllProduct() {
        String sql = "SELECT * FROM product";
        var rowMapper = BeanPropertyRowMapper.newInstance(Product.class);
        return jdbcTemplate.query(sql, rowMapper);
    }
    
}
