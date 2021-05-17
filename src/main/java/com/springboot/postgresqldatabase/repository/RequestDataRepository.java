package com.springboot.postgresqldatabase.repository;

import com.springboot.postgresqldatabase.model.RequestData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestDataRepository extends JpaRepository<RequestData, Long> {
}
