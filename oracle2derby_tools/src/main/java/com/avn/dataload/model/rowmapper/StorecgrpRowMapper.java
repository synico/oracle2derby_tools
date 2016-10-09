package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storecgrp;

public class StorecgrpRowMapper<T> implements RowMapper<Storecgrp> {

	@Override
	public Storecgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storecgrp obj = new Storecgrp();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
