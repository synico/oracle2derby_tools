package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTRTYPE;

public class ATTRTYPERowMapper<T> implements RowMapper<ATTRTYPE> {

	@Override
	public ATTRTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTRTYPE obj = new ATTRTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setOID(rs.getString("OID"));
		
		return obj;
	}

}
