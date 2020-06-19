package com.nagarro.msa.orders.controller;

import com.nagarro.msa.orders.orderbean.Order;
import com.nagarro.msa.orders.orderdto.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	
	@GetMapping("/{id}")
	public  List<OrderDto> retrieveProduct(@PathVariable Integer id) {
		List<Order> orders = new ArrayList<>();
		
		Order order1= new Order(1, 250,"14-Apr-2020");
		Order order2= new Order(2, 450,"15-Apr-2020");
		Order order3= new Order(3, 650,"14-Apr-2020");
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		
		List<OrderDto> orderDto = new ArrayList<OrderDto>();
		orders.stream().forEach(order ->
			orderDto.add(new OrderDto(order.getOrderId(), order.getOrderAmount(), order.getOrderDate())));
		return orderDto;
	}

}
