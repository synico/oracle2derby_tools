package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATENTTYPE;

public class CATENTTYPERowMapper<T> implements RowMapper<CATENTTYPE> {

	@Override
	public CATENTTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATENTTYPE obj = new CATENTTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setOID(rs.getString("OID"));
		obj.setCATENTTYPE_ID(rs.getString("CATENTTYPE_ID"));
		
		return obj;
	}

}
