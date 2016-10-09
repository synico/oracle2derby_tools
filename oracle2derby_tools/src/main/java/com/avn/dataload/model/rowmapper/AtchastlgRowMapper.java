package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Atchastlg;

public class AtchastlgRowMapper<T> implements RowMapper<Atchastlg> {

	@Override
	public Atchastlg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Atchastlg obj = new Atchastlg();
		
		obj.setAtchastlgId(rs.getBigDecimal("ATCHASTLG_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAtchastId(rs.getBigDecimal("ATCHAST_ID"));
		
		return obj;
	}

}
