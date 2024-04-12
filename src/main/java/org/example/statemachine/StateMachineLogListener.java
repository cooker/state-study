package org.example.statemachine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

/**
 * grant
 * 2/4/2024 5:24 pm
 **/
@Slf4j
public class StateMachineLogListener<S extends StateMap, E extends EventMap > extends StateMachineListenerAdapter<S, E> {

    @Override
    public void stateChanged(State<S, E> from, State<S, E> to) {
        log.info("State change {} to {}", from.getId(), to.getId());
    }

    @Override
    public void stateContext(StateContext<S, E> stateContext) {
        if (stateContext.getStage() == StateContext.Stage.STATE_ENTRY) {
            log.info("{} enter {}", stateContext.getStateMachine().getId(), stateContext.getTarget().getId());
        } else if (stateContext.getStage() == StateContext.Stage.STATE_EXIT) {
            log.info("{} exit {}", stateContext.getStateMachine().getId(), stateContext.getSource().getId());
        }
    }
}
