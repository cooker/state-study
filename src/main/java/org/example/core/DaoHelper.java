package org.example.core;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.StopWatch;

import java.util.List;

/**
 * grant
 * 2024/4/15 14:38
 **/
@Slf4j
@Component
public class DaoHelper {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public <T,M> void insertBatch(Class cl, List<T> datas) {
        long start = System.currentTimeMillis();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("批量插入 " + ClassUtils.getShortName(cl));
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH,false);
        BaseMapper mapper = (BaseMapper) sqlSession.getMapper(cl);
        datas.stream().forEach(data -> mapper.insert(data));
        sqlSession.commit();
        sqlSession.clearCache();
        stopWatch.stop();
        log.info("批量插入：\n{}",stopWatch.prettyPrint());
    }
}
