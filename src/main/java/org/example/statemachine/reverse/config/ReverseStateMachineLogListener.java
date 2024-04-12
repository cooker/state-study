package org.example.statemachine.reverse.config;

import org.example.statemachine.StateMachineLogListener;
import org.example.statemachine.reverse.core.ReverseEventEnum;
import org.example.statemachine.reverse.core.ReverseStateEnum;
import org.springframework.stereotype.Component;

/**
 * grant
 * 2/4/2024 5:50 pm
 **/
@Component
public class ReverseStateMachineLogListener extends StateMachineLogListener<ReverseStateEnum, ReverseEventEnum> {
}
