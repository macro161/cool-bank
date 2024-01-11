package com.coolbank.coolbank.repository;

import com.coolbank.coolbank.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
