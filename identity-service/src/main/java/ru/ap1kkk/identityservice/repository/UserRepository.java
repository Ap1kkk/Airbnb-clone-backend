package ru.ap1kkk.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ap1kkk.identityservice.entity.User;

import java.util.Optional;

/**
 * @author Egor Bokov
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
}
