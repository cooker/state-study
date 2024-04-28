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

    List<OrdWorkflow> selectByExampleSelective(@Param("example") OrdWorkflowExample example, @Param("selective") OrdWorkflow.Column ... selective);

    OrdWorkflow selectOneByExample(OrdWorkflowExample example);

    OrdWorkflow selectOneByExampleSelective(@Param("example") OrdWorkflowExample example, @Param("selective") OrdWorkflow.Column ... selective);

    List<OrdWorkflow> selectByExample(OrdWorkflowExample example);

    OrdWorkflow selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") OrdWorkflow.Column ... selective);

    OrdWorkflow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OrdWorkflow row, @Param("example") OrdWorkflowExample example);

    int updateByExample(@Param("row") OrdWorkflow row, @Param("example") OrdWorkflowExample example);

    int updateByPrimaryKeySelective(OrdWorkflow row);

    int updateByPrimaryKey(OrdWorkflow row);

    int batchInsert(@Param("list") List<OrdWorkflow> list);

    int batchInsertSelective(@Param("list") List<OrdWorkflow> list, @Param("selective") OrdWorkflow.Column ... selective);
}