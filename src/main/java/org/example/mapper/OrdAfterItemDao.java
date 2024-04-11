package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.entity.OrdAfterItem;
import org.springframework.stereotype.Repository;

@Mapper
public interface OrdAfterItemDao extends BaseMapper<OrdAfterItem> {

}