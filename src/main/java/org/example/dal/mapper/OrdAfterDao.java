package org.example.dal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.dal.entity.OrdAfter;

import java.util.List;

@Mapper
public interface OrdAfterDao extends BaseMapper<OrdAfter> {
    List<OrdAfter> findByOrderId(@Param("orderId") String orderId);
}