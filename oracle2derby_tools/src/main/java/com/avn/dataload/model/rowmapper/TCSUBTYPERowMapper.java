package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TCSUBTYPE;

public class TCSUBTYPERowMapper<T> implements RowMapper<TCSUBTYPE> {

	@Override
	public TCSUBTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		TCSUBTYPE obj = new TCSUBTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTCSUBTYPE_ID(rs.getString("TCSUBTYPE_ID"));
		obj.setDEPLOYCOMMAND(rs.getString("DEPLOYCOMMAND"));
		obj.setACCESSBEANNAME(rs.getString("ACCESSBEANNAME"));
		obj.setTCTYPE_ID(rs.getString("TCTYPE_ID"));
		
		return obj;
	}

}
