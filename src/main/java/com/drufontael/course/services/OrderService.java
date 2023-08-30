package com.drufontael.course.services;

import com.drufontael.course.entities.Order;
import com.drufontael.course.entities.User;
import com.drufontael.course.repositories.OrderRepository;
import com.drufontael.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj=orderRepository.findById(id);
        return obj.get();
    }
}
