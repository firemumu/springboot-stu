package cn.excgo.springbootstu.repository;

import cn.excgo.springbootstu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>, Serializable {

    // JpaRepository: SpringDataJPA提供的简单数据操作接口
    // JpaSpecificationExecutor: SpringDataJPA提供的复杂查询接口
    // Serializable: 序列化接口

}
