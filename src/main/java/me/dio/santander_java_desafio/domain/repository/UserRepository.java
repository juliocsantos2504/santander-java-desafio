package me.dio.santander_java_desafio.domain.repository;

import me.dio.santander_java_desafio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
