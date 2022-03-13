package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private OrderRepository repo;

    @Autowired
    public OrderService(OrderRepository rep){
        this.repo = rep;
    }

    public List<Order> getOrders() {
        List<Order> list = new ArrayList<>();
        repo.findAll().forEach(list::add);
        return list;
    }
}
