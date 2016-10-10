package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMELEMENTTYPE;

public class DMELEMENTTYPERowMapper<T> implements RowMapper<DMELEMENTTYPE> {

	@Override
	public DMELEMENTTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMELEMENTTYPE obj = new DMELEMENTTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setDMELEMENTTYPE_ID(rs.getBigDecimal("DMELEMENTTYPE_ID"));
		
		return obj;
	}

}
