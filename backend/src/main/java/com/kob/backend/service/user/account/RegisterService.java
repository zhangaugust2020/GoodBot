package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author August
 * @date 2022/7/27 - 14:44
 */
public interface RegisterService {

    public Map<String, String> register(String username, String password, String confirmedPassword);

}
