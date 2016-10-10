package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACACTION;

public class ACACTIONRowMapper<T> implements RowMapper<ACACTION> {

	@Override
	public ACACTION mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACACTION obj = new ACACTION();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACTION(rs.getString("ACTION"));
		obj.setACACTION_ID(rs.getBigDecimal("ACACTION_ID"));
		
		return obj;
	}

}
