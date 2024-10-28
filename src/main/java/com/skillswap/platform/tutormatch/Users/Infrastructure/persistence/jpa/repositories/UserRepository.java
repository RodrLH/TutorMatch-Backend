package com.skillswap.platform.tutormatch.Users.Infrastructure.persistence.jpa.repositories;

import com.skillswap.platform.tutormatch.Users.Domain.Model.Aggregates.User;
import com.skillswap.platform.tutormatch.Users.Domain.Model.ValueObjects.EmailAddress;
import com.skillswap.platform.tutormatch.Users.Domain.Model.ValueObjects.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for managing {@link User} entities.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Retrieves a user by their email address.
     *
     * @param email the {@link EmailAddress} of the user to be retrieved
     * @return an {@link Optional} containing the {@link User} if found,
     * or empty if no user matches the email
     */
    Optional<User> findByEmail(EmailAddress email);

    /**
     * Retrieves a list of users that have the specified role.
     *
     * @param roleType the {@link RoleType} to filter users by
     * @return a {@link List} of {@link User} objects that match the specified role
     */
    List<User> findByRoleRoleType(RoleType roleType);
}
