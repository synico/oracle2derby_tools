package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.POLICYTC;

public class POLICYTCRowMapper<T> implements RowMapper<POLICYTC> {

	@Override
	public POLICYTC mapRow(ResultSet rs, int rowNum) throws SQLException {
		POLICYTC obj = new POLICYTC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPOLICY_ID(rs.getBigDecimal("POLICY_ID"));
		obj.setTERMCOND_ID(rs.getBigDecimal("TERMCOND_ID"));
		
		return obj;
	}

}
