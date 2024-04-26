package org.example.dal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.entity.OrdOrderItem;

import java.util.List;

@Mapper
public interface OrdOrderItemDao extends BaseMapper<OrdOrderItem> {

    List<OrdOrderItem> selectByOrderId(@Param("orderId") String orderId);
}