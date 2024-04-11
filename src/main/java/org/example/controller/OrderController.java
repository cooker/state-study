package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * grant
 * 28/3/2024 5:25 pm
 **/
@Slf4j
@RequestMapping("/order")
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/create")
    public String create() {
        return orderService.create();
    }

}
