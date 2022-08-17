package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author August
 * @date 2022/8/14 - 13:56
 */
@Mapper
public interface RecordMapper extends BaseMapper<Record> {
}
