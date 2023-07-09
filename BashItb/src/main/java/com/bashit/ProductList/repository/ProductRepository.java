package com.bashit.ProductList.repository;

import com.bashit.ProductList.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
//    Optional<Product> findAllByTitle(String title);

    List<Product> findAllByCategory(String category);
}
