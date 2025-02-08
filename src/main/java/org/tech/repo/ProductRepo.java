package org.tech.repo;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tech.model.Product;
import org.springframework.data.domain.Pageable;


@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    // Pagination is supported by default in JpaRepository
    Page<Product> findAll(Pageable pageable);
    
    @Query("SELECT p FROM Product p JOIN FETCH p.category WHERE p.id = :productId")
    Optional<Product> findByIdWithCategory(@Param("productId") Long productId);
}
