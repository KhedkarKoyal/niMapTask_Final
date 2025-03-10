package org.tech.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tech.model.Category;


public interface CatRepo extends JpaRepository<Category, Long> {
	Page<Category> findAll(Pageable pageable);
}