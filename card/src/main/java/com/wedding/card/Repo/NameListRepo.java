package com.wedding.card.Repo;

import com.wedding.card.Entity.NameListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameListRepo extends JpaRepository<NameListEntity, Integer> {
}
