package org.entando.demo.banking.repository;

import org.entando.demo.banking.domain.Checking;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Checking entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CheckingRepository extends JpaRepository<Checking, Long> {
}
