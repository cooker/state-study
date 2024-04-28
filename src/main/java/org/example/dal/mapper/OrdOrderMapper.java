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

    List<OrdOrder> selectByExampleSelective(@Param("example") OrdOrderExample example, @Param("selective") OrdOrder.Column ... selective);

    OrdOrder selectOneByExample(OrdOrderExample example);

    OrdOrder selectOneByExampleSelective(@Param("example") OrdOrderExample example, @Param("selective") OrdOrder.Column ... selective);

    List<OrdOrder> selectByExample(OrdOrderExample example);

    OrdOrder selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") OrdOrder.Column ... selective);

    OrdOrder selectByPrimaryKey(Long id);

    OrdOrder selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("row") OrdOrder row, @Param("example") OrdOrderExample example);

    int updateByExample(@Param("row") OrdOrder row, @Param("example") OrdOrderExample example);

    int updateByPrimaryKeySelective(OrdOrder row);

    int updateByPrimaryKey(OrdOrder row);

    int logicalDeleteByExample(@Param("example") OrdOrderExample example);

    int logicalDeleteByPrimaryKey(Long id);

    int batchInsert(@Param("list") List<OrdOrder> list);

    int batchInsertSelective(@Param("list") List<OrdOrder> list, @Param("selective") OrdOrder.Column ... selective);
}