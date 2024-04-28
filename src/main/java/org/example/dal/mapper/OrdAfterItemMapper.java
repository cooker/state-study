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

    List<OrdAfterItem> selectByExampleSelective(@Param("example") OrdAfterItemExample example, @Param("selective") OrdAfterItem.Column ... selective);

    OrdAfterItem selectOneByExample(OrdAfterItemExample example);

    OrdAfterItem selectOneByExampleSelective(@Param("example") OrdAfterItemExample example, @Param("selective") OrdAfterItem.Column ... selective);

    List<OrdAfterItem> selectByExample(OrdAfterItemExample example);

    OrdAfterItem selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") OrdAfterItem.Column ... selective);

    OrdAfterItem selectByPrimaryKey(Long id);

    OrdAfterItem selectByPrimaryKeyWithLogicalDelete(@Param("id") Long id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("row") OrdAfterItem row, @Param("example") OrdAfterItemExample example);

    int updateByExample(@Param("row") OrdAfterItem row, @Param("example") OrdAfterItemExample example);

    int updateByPrimaryKeySelective(OrdAfterItem row);

    int updateByPrimaryKey(OrdAfterItem row);

    int logicalDeleteByExample(@Param("example") OrdAfterItemExample example);

    int logicalDeleteByPrimaryKey(Long id);

    int batchInsert(@Param("list") List<OrdAfterItem> list);

    int batchInsertSelective(@Param("list") List<OrdAfterItem> list, @Param("selective") OrdAfterItem.Column ... selective);
}