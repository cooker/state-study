package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * grant
 * 28/3/2024 5:43 pm
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderPageVO implements Serializable {
    private String orderId;
    private Double amount;
}
