package com.API01.repos;

import com.API01.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductsRepo extends JpaRepository<Product,Long> {
        List<Product> findAllByDescription(String description);
}
