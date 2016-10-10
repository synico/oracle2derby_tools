package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACATTR;

public class ACATTRRowMapper<T> implements RowMapper<ACATTR> {

	@Override
	public ACATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACATTR obj = new ACATTR();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACATTR_ID(rs.getBigDecimal("ACATTR_ID"));
		obj.setATTRNAME(rs.getString("ATTRNAME"));
		obj.setDATATYPE(rs.getBigDecimal("DATATYPE"));
		
		return obj;
	}

}
