package com.bat.petra.data.repository;


import com.bat.petra.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT c.id FROM Product c WHERE c.productId = ?1")
    String getProductId(String id);
}
