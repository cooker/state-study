package org.example.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.dal.mapper.OrdWorkflowMapper;
import org.example.dal.model.OrdWorkflow;

@Mapper
public interface OrdWorkflowDao extends OrdWorkflowMapper, BaseMapper<OrdWorkflow> {
}
