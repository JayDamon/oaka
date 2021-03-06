package com.factotum.oaka.repository;

import com.factotum.oaka.model.TransactionCategory;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionSubCategoryRepository extends ReactiveCrudRepository<TransactionCategory, Long> {
}
