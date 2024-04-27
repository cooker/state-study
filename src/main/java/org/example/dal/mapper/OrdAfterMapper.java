package org.example.dal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.model.OrdAfter;
import org.example.dal.model.OrdAfterExample;

@Mapper
public interface OrdAfterMapper {
    long countByExample(OrdAfterExample example);

    int deleteByExample(OrdAfterExample example);

    int deleteByPrimaryKey(Long id);

    List<OrdAfter> selectByExample(OrdAfterExample example);

    OrdAfter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OrdAfter row, @Param("example") OrdAfterExample example);

    int updateByExample(@Param("row") OrdAfter row, @Param("example") OrdAfterExample example);

    int updateByPrimaryKeySelective(OrdAfter row);

    int updateByPrimaryKey(OrdAfter row);
}