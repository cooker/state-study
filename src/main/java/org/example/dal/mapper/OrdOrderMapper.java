package org.example.dal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.model.OrdOrder;
import org.example.dal.model.OrdOrderExample;

@Mapper
public interface OrdOrderMapper {
    long countByExample(OrdOrderExample example);

    int deleteByExample(OrdOrderExample example);

    int deleteByPrimaryKey(Long id);

    List<OrdOrder> selectByExample(OrdOrderExample example);

    OrdOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OrdOrder row, @Param("example") OrdOrderExample example);

    int updateByExample(@Param("row") OrdOrder row, @Param("example") OrdOrderExample example);

    int updateByPrimaryKeySelective(OrdOrder row);

    int updateByPrimaryKey(OrdOrder row);
}