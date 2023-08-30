package com.drufontael.course.repositories;

import com.drufontael.course.entities.Product;
import com.drufontael.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
