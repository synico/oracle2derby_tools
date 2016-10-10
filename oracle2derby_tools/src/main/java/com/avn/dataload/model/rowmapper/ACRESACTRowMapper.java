package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESACT;

public class ACRESACTRowMapper<T> implements RowMapper<ACRESACT> {

	@Override
	public ACRESACT mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESACT obj = new ACRESACT();
		
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACACTION_ID(rs.getBigDecimal("ACACTION_ID"));
		
		return obj;
	}

}
