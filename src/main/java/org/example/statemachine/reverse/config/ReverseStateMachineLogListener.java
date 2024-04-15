package org.example.statemachine.reverse.config;

import org.example.statemachine.StateMachineLogListener;
import org.example.statemachine.reverse.core.ReverseEventEnum;
import org.example.statemachine.reverse.core.ReverseHeaders;
import org.example.statemachine.reverse.core.ReverseStateEnum;
import org.springframework.statemachine.StateContext;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * grant
 * 2/4/2024 5:50 pm
 **/
@Component
public class ReverseStateMachineLogListener extends StateMachineLogListener<ReverseStateEnum, ReverseEventEnum> {
    @Override
    protected String external(StateContext<ReverseStateEnum, ReverseEventEnum> stateContext) {
        String aferId = Objects.toString(stateContext.getExtendedState().getVariables().get(ReverseHeaders.AFTER_ID));
        return "售后单号：" + aferId == null ? stateContext.getMessageHeader(ReverseHeaders.AFTER_ID) + ""  : aferId;
    }
}
