package com.example.WebFin.repos;

import org.springframework.data.repository.CrudRepository;
import com.example.WebFin.domain.CompanyInfo;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CompanyInfoRepo extends CrudRepository<CompanyInfo, Integer> {
    List<CompanyInfo> findByTickerIgnoreCase(String ticker);
}