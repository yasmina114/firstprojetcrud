package com.developer.firstprojetcrud.repository;

import com.developer.firstprojetcrud.entity.CategoproddbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoprodRepository extends JpaRepository<CategoproddbEntity,Long> {
}
