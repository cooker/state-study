package org.example.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ord_after_workflow
 */
@Data
public class OrdAfterWorkflow implements Serializable {
    private Long id;

    private String afterId;

    private Byte currentStatusCd;

    private Byte nextStatusCd;

    private Date createdTime;

    private String remark;

    private static final long serialVersionUID = 1L;
}