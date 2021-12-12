package com.clarity.blog.modules.users.repository;

import com.clarity.blog.modules.users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByEmail(String email);

//    @Query(nativeQuery = true, value = "select * from users")
    @Query("select u from Users u where u.email = :email")
    Users findByQuery(@Param("email") String email);

}
