package org.example.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.dal.mapper.OrdAfterItemMapper;
import org.example.dal.model.OrdAfterItem;

@Mapper
public interface OrdAfterItemDao extends OrdAfterItemMapper, BaseMapper<OrdAfterItem> {
}
