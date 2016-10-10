package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PROCSYS;

public class PROCSYSRowMapper<T> implements RowMapper<PROCSYS> {

	@Override
	public PROCSYS mapRow(ResultSet rs, int rowNum) throws SQLException {
		PROCSYS obj = new PROCSYS();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setPROCSYSNAME(rs.getString("PROCSYSNAME"));
		
		return obj;
	}

}
