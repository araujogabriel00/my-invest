package com.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}
