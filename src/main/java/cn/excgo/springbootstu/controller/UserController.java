package cn.excgo.springbootstu.controller;

import cn.excgo.springbootstu.entity.User;
import cn.excgo.springbootstu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * 保存用户
     * @param user
     * */
    @PostMapping("/saveOrUpdate")
    public void saveOrUpdateUser(HttpServletResponse response, User user) throws IOException {
        userRepository.saveOrUpdateUser(user);
        response.sendRedirect("/users/all");
    }

    /**
     * 删除用户
     * @param id
     * */
    @GetMapping(value = "/delete/{id}")
    public void deleteUserById(@PathVariable("id") Long id, HttpServletResponse response) throws IOException {
        userRepository.deleteUser(id);
        response.sendRedirect("/users/all");
    }

    /**
     * 查询所有用户
     * @return users
     * */
    @RequestMapping("/all")
    public List<User> list() {
        return userRepository.listUser();
    }

    /**
     * 根据id查询用户
     * @param id
     * @return user
     * */
    @GetMapping("{id}")
    public User getUserById(@PathVariable("id") Long id) {
        User user = userRepository.getUserById(id);
        return user;
    }

}
