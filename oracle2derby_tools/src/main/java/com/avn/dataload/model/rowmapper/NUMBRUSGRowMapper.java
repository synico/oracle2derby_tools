package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.NUMBRUSG;

public class NUMBRUSGRowMapper<T> implements RowMapper<NUMBRUSG> {

	@Override
	public NUMBRUSG mapRow(ResultSet rs, int rowNum) throws SQLException {
		NUMBRUSG obj = new NUMBRUSG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCODE(rs.getString("CODE"));
		obj.setNUMBRUSG_ID(rs.getBigDecimal("NUMBRUSG_ID"));
		
		return obj;
	}

}
