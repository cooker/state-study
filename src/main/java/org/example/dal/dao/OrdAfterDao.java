package org.example.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.mapper.OrdAfterMapper;
import org.example.dal.model.OrdAfter;

import java.util.List;

@Mapper
public interface OrdAfterDao extends OrdAfterMapper, BaseMapper<OrdAfter> {

    List<OrdAfter> findByOrderId(@Param("orderId") String orderId);
}
