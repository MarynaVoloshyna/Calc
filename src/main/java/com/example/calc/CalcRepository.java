package com.example.calc;

import com.example.calc.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalcRepository extends JpaRepository<Calculation, Long> {
}