package org.example.dal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.model.OrdOrderItem;
import org.example.dal.model.OrdOrderItemExample;

@Mapper
public interface OrdOrderItemMapper {
    long countByExample(OrdOrderItemExample example);

    int deleteByExample(OrdOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    List<OrdOrderItem> selectByExampleSelective(@Param("example") OrdOrderItemExample example, @Param("selective") OrdOrderItem.Column ... selective);

    OrdOrderItem selectOneByExample(OrdOrderItemExample example);

    OrdOrderItem selectOneByExampleSelective(@Param("example") OrdOrderItemExample example, @Param("selective") OrdOrderItem.Column ... selective);

    List<OrdOrderItem> selectByExample(OrdOrderItemExample example);

    OrdOrderItem selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") OrdOrderItem.Column ... selective);

    OrdOrderItem selectByPrimaryKey(Long id);

    OrdOrderItem selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("row") OrdOrderItem row, @Param("example") OrdOrderItemExample example);

    int updateByExample(@Param("row") OrdOrderItem row, @Param("example") OrdOrderItemExample example);

    int updateByPrimaryKeySelective(OrdOrderItem row);

    int updateByPrimaryKey(OrdOrderItem row);

    int logicalDeleteByExample(@Param("example") OrdOrderItemExample example);

    int logicalDeleteByPrimaryKey(Long id);

    int batchInsert(@Param("list") List<OrdOrderItem> list);

    int batchInsertSelective(@Param("list") List<OrdOrderItem> list, @Param("selective") OrdOrderItem.Column ... selective);
}