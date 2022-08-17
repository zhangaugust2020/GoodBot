package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author August
 * @date 2022/7/27 - 14:42
 */
public interface LoginService {

    public Map<String, String> getToken(String username, String password);

}
