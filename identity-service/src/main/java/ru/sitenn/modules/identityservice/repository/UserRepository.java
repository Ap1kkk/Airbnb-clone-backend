package ru.sitenn.modules.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sitenn.modules.identityservice.entity.User;

import java.util.Optional;

/**
 * @author Egor Bokov
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
}
