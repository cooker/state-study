package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.example.model.ddd.AfterCreateDto;
import org.example.statemachine.reverse.core.ReverseEventEnum;
import org.example.statemachine.reverse.core.ReverseStateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * grant
 * 3/4/2024 10:38 am
 **/
@Slf4j
@Api("售后")
@RequestMapping("/after")
@RestController
public class AfterController {

    @Autowired
    private StateMachine<ReverseStateEnum, ReverseEventEnum> stateMachine;

    @ApiOperation("创建")
    @PostMapping("/create")
    public String create(@RequestBody AfterCreateDto body) {
        boolean isOk = stateMachine.sendEvent(MessageBuilder.withPayload(ReverseEventEnum.E_CREATE)
                .setHeader("afterCreateDto", body)
                .build());
        return isOk + "";
    }

}
