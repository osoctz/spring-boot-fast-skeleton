package cn.com.git.sfs.repository;

import cn.com.git.sfs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户接口
 * Created by git on 2018/2/11.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
