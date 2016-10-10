package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ITEMTYPE;

public class ITEMTYPERowMapper<T> implements RowMapper<ITEMTYPE> {

	@Override
	public ITEMTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		ITEMTYPE obj = new ITEMTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setITEMTYPE_ID(rs.getString("ITEMTYPE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setOID(rs.getString("OID"));
		
		return obj;
	}

}
