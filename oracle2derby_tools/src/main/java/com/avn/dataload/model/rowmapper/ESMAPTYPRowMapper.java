package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ESMAPTYP;

public class ESMAPTYPRowMapper<T> implements RowMapper<ESMAPTYP> {

	@Override
	public ESMAPTYP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ESMAPTYP obj = new ESMAPTYP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setESMAPTYP_ID(rs.getBigDecimal("ESMAPTYP_ID"));
		
		return obj;
	}

}
