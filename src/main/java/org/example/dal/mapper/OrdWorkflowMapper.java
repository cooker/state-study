package org.example.dal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.model.OrdWorkflow;
import org.example.dal.model.OrdWorkflowExample;

@Mapper
public interface OrdWorkflowMapper {
    long countByExample(OrdWorkflowExample example);

    int deleteByExample(OrdWorkflowExample example);

    int deleteByPrimaryKey(Long id);

    List<OrdWorkflow> selectByExample(OrdWorkflowExample example);

    OrdWorkflow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OrdWorkflow row, @Param("example") OrdWorkflowExample example);

    int updateByExample(@Param("row") OrdWorkflow row, @Param("example") OrdWorkflowExample example);

    int updateByPrimaryKeySelective(OrdWorkflow row);

    int updateByPrimaryKey(OrdWorkflow row);
}