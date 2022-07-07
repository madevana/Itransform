package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.model.Order;
import com.springrest.repositories.OrderRepo;


@Service

public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public List<Order> getAllOrder(){
        final List<Order> orderList = new ArrayList<>();

       orderRepo.findAll().forEach(orderList::add);
        return  orderList;
    }

    public Order getOrderById(int id){
      return  orderRepo.findById(id).get();
    }

    public Order addOrder(Order order){
        return orderRepo.save(order);
    }

    public boolean deleteOrder(int id){
         orderRepo.deleteById(id);
         return true;
    }
  

}