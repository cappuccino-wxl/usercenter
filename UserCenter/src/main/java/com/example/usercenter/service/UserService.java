package com.example.usercenter.service;

import com.example.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
* @author asus
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-04-30 13:04:14
*/
public interface UserService extends IService<User> {
    /**
     * @description: 用户注册
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 检查密码
     * @param planetCode 星球编号
     * @return long
     * @date: 2023/4/30 16:45
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * @description: 用户登录
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @return com.example.usercenter.model.domain.User
     * @date: 2023/4/30 18:32
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * @description: 用户脱敏
     * @param originUser
     * @return com.example.usercenter.model.domain.User
     * @date: 2023/4/30 21:48
     */
    User getSafeUser(User originUser);

    /**
     * @description: 用户注销
     * @param request
     * @return int
     * @date: 2023/5/2 13:53
     */
    int userLogout(HttpServletRequest request);

    /**
     * @description: 根据标签搜索用户
     * @param tagNameList
     * @return java.util.List<com.example.usercenter.model.domain.User>
     * @date: 2023/5/4 21:28
     */
//    List<User> searchUsersByTags(List<String> tagNameList);

}
