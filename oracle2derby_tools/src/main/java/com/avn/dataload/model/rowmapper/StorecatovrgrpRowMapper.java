package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storecatovrgrp;

public class StorecatovrgrpRowMapper<T> implements RowMapper<Storecatovrgrp> {

	@Override
	public Storecatovrgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storecatovrgrp obj = new Storecatovrgrp();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
