package com.drufontael.course.repositories;

import com.drufontael.course.entities.OrderItem;
import com.drufontael.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
