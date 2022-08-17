package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author August
 * @date 2022/7/23 - 15:23
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
