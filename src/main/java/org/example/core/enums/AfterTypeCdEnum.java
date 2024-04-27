package org.example.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Predicate;

@Getter
@AllArgsConstructor
public enum AfterTypeCdEnum implements Predicate<Integer> {
    Return_GOOD(1, "退货"),
    REplace_good(2, "换货"),
    ;
    private Integer code;
    private String msg;


    @Override
    public boolean test(Integer typeCd) {
        return this.code.equals(typeCd);
    }
}
