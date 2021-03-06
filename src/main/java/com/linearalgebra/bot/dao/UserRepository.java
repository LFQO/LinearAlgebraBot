package com.linearalgebra.bot.dao;

import com.linearalgebra.bot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByChatId(long chatId);
}
