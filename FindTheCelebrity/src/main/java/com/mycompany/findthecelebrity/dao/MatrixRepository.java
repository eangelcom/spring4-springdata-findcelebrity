package com.mycompany.findthecelebrity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.mycompany.findthecelebrity.model.Matrix;

public interface MatrixRepository extends JpaRepository<Matrix, Long> {

	List<Matrix> findByPartyId(@Param("partyId") Long partyId);

}
