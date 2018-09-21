package cn.excgo.springbootstu.repository;

import cn.excgo.springbootstu.entity.User;

import java.util.List;

public interface UserRepository {

    /**
     * 新增或者修改用户
     * @param user
     * @return user
     * */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param id
     * */
    void deleteUser(Long id);

    /**
     * 根据用户id获取用户
     * @param id
     * @return User
     * */
    User getUserById(Long id);

    /**
     * 获取所有用户的列表
     * @return List<User>
     * */
    List<User> listUser();

}
