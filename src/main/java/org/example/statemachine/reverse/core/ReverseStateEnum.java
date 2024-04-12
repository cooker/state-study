package org.example.statemachine.reverse.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.statemachine.StateMap;

import java.util.function.Predicate;

/**
 * 售后状态
 */
@Getter
@AllArgsConstructor
public enum ReverseStateEnum implements StateMap, Predicate<Integer> {
    CREATED(0, "待售后"),
    AUDIT_ING(1, "待审核"),
    DOING(3,"售后中"),
    FINISH(4,"已完成"),
    CANCEL(5,"已取消"),
    CLOSED(6,"已关闭"),
    ERROR(7,"售后异常"),
    ;
    private Integer state;
    private String name;


    @Override
    public boolean test(Integer state) {
        return this.state.equals(state);
    }
}
