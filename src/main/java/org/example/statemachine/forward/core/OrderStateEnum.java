package org.example.statemachine.forward.core;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.statemachine.StateMap;

import java.util.function.Predicate;

@Getter
@AllArgsConstructor
public enum OrderStateEnum implements StateMap, Predicate<Integer> {
    S0(0, "待支付"),
    S1(1, "已支付"),
    S2(2, "待收货"),
    S3(3, "已退款"),
    S4(4, "已关闭"),
    S5(5, "已完成"),
    ;
    private Integer statusCd;
    private String name;

    @Override
    public boolean test(Integer statusCd) {
        return this.statusCd.equals(statusCd);
    }
}
