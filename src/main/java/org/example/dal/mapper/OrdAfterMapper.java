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

    List<OrdAfter> selectByExampleSelective(@Param("example") OrdAfterExample example, @Param("selective") OrdAfter.Column ... selective);

    OrdAfter selectOneByExample(OrdAfterExample example);

    OrdAfter selectOneByExampleSelective(@Param("example") OrdAfterExample example, @Param("selective") OrdAfter.Column ... selective);

    List<OrdAfter> selectByExample(OrdAfterExample example);

    OrdAfter selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") OrdAfter.Column ... selective);

    OrdAfter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OrdAfter row, @Param("example") OrdAfterExample example);

    int updateByExample(@Param("row") OrdAfter row, @Param("example") OrdAfterExample example);

    int updateByPrimaryKeySelective(OrdAfter row);

    int updateByPrimaryKey(OrdAfter row);

    int batchInsert(@Param("list") List<OrdAfter> list);

    int batchInsertSelective(@Param("list") List<OrdAfter> list, @Param("selective") OrdAfter.Column ... selective);
}