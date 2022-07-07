package com.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.springrest.model.Order;
import com.springrest.service.OrderService;

@RestController
@CrossOrigin(origins = "http://localhost:8082")
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping("/getall")
    public List<Order> getAllOrder(){
        List<Order> list = orderService.getAllOrder();
         return  list;
    }
    @GetMapping("/getbyid")
    public Order getOrderById(@PathVariable("id") int id){
        return orderService.getOrderById(id);
    }
@PostMapping("/add")
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);

    }

   @DeleteMapping("/delete")
    public boolean deleteOrder(@PathVariable("id") int id){
        return orderService.deleteOrder(id);

    }


}



