package com.example.demo.repository;

import com.example.demo.domain.EapSourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.MANDATORY, readOnly = true)
public interface EapSourceRepository extends JpaRepository<EapSourceEntity, Long> {

}
