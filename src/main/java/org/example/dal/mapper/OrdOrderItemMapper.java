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

    List<OrdOrderItem> selectByExample(OrdOrderItemExample example);

    OrdOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OrdOrderItem row, @Param("example") OrdOrderItemExample example);

    int updateByExample(@Param("row") OrdOrderItem row, @Param("example") OrdOrderItemExample example);

    int updateByPrimaryKeySelective(OrdOrderItem row);

    int updateByPrimaryKey(OrdOrderItem row);
}