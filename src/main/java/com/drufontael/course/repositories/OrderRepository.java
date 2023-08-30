package com.drufontael.course.repositories;

import com.drufontael.course.entities.Order;
import com.drufontael.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
