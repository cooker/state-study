package org.example.dal.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * ord_after_workflow
 */
@Data
public class OrdAfterWorkflow implements Serializable {
    private Long id;

    private String afterId;

    private Integer currentStatusCd;

    private Integer nextStatusCd;

    private LocalDateTime createdTime;

    private String remark;

    private static final long serialVersionUID = 1L;
}