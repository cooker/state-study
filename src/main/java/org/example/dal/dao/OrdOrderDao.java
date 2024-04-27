package org.example.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.mapper.OrdOrderMapper;
import org.example.dal.model.OrdOrder;

@Mapper
public interface OrdOrderDao extends OrdOrderMapper, BaseMapper<OrdOrder> {

    OrdOrder findByOrderId(@Param("orderId") String orderId);
}
