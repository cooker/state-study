package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entity.OrdAfter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface OrdAfterDao extends BaseMapper<OrdAfter> {
    List<OrdAfter> findByOrderId(@Param("orderId") String orderId);
}