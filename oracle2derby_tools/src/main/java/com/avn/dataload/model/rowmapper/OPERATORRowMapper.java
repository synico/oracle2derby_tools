package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.OPERATOR;

public class OPERATORRowMapper<T> implements RowMapper<OPERATOR> {

	@Override
	public OPERATOR mapRow(ResultSet rs, int rowNum) throws SQLException {
		OPERATOR obj = new OPERATOR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOPERATOR(rs.getString("OPERATOR"));
		obj.setOPERATOR_ID(rs.getBigDecimal("OPERATOR_ID"));
		obj.setOPERATORTYPE(rs.getString("OPERATORTYPE"));
		
		return obj;
	}

}
