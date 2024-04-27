package org.example.dal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.model.OrdAfterItem;
import org.example.dal.model.OrdAfterItemExample;

@Mapper
public interface OrdAfterItemMapper {
    long countByExample(OrdAfterItemExample example);

    int deleteByExample(OrdAfterItemExample example);

    int deleteByPrimaryKey(Long id);

    List<OrdAfterItem> selectByExample(OrdAfterItemExample example);

    OrdAfterItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OrdAfterItem row, @Param("example") OrdAfterItemExample example);

    int updateByExample(@Param("row") OrdAfterItem row, @Param("example") OrdAfterItemExample example);

    int updateByPrimaryKeySelective(OrdAfterItem row);

    int updateByPrimaryKey(OrdAfterItem row);
}