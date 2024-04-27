package org.example.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.mapper.OrdOrderItemMapper;
import org.example.dal.model.OrdOrderItem;

import java.util.List;

@Mapper
public interface OrdOrderItemDao extends OrdOrderItemMapper, BaseMapper<OrdOrderItem> {
    List<OrdOrderItem> findByOrderId(@Param("orderId") String orderId);
}
