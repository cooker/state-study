package org.example.dal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.dal.entity.OrdOrder;

@Mapper
public interface OrdOrderDao extends BaseMapper<OrdOrder> {

}