package com.springboot.postgresqldatabase.repository;

import com.springboot.postgresqldatabase.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
