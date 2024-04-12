package org.example.statemachine.reverse.config;

import lombok.extern.slf4j.Slf4j;
import org.example.statemachine.StateMachineLogListener;
import org.example.statemachine.reverse.core.ReverseEventEnum;
import org.example.statemachine.reverse.core.ReverseStateEnum;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachineFactory;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.util.ClassUtils;

import javax.annotation.Resource;
import java.util.EnumSet;

/**
 * grant
 * 2/4/2024 5:37 pm
 * 逆向状态机配置
 **/
@Slf4j
@Configuration
@EnableStateMachineFactory
public class ReverseStateMachineConfig extends EnumStateMachineConfigurerAdapter<ReverseStateEnum, ReverseEventEnum> {

    @Resource
    private StateMachineLogListener reverseStateMachineLogListener;

    @Override
    public void configure(StateMachineStateConfigurer<ReverseStateEnum, ReverseEventEnum> states) throws Exception {
        //配置可用状态
        states.withStates().initial(ReverseStateEnum.CREATED)
                .end(ReverseStateEnum.FINISH)
                .end(ReverseStateEnum.CANCEL)
                .end(ReverseStateEnum.CLOSED)
                .end(ReverseStateEnum.ERROR)
                .states(EnumSet.allOf(ReverseStateEnum.class));
    }



    @Override
    public void configure(StateMachineConfigurationConfigurer<ReverseStateEnum, ReverseEventEnum> config) throws Exception {
        //配置状态机ID
        config.withConfiguration().autoStartup(true)
              .listener(reverseStateMachineLogListener)
              .machineId(ClassUtils.getShortName(ReverseStateMachineConfig.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<ReverseStateEnum, ReverseEventEnum> transitions) throws Exception {
        //配置状态流转
        transitions.withExternal()
                .source(ReverseStateEnum.CREATED).target(ReverseStateEnum.CREATED)
                .event(ReverseEventEnum.E_CREATE);
    }
}