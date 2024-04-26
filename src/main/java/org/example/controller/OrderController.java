package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.example.dal.entity.ddd.OrderListVo;
import org.example.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * grant
 * 28/3/2024 5:25 pm
 **/
@Slf4j
@Api("订单")
@RequestMapping("/order")
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @ApiOperation("创建")
    @GetMapping("/create")
    public String create() {
        return orderService.create();
    }

    @ApiOperation("列表")
    @GetMapping("/list")
    public List<OrderListVo> list() {
        return orderService.list();
    }
}
