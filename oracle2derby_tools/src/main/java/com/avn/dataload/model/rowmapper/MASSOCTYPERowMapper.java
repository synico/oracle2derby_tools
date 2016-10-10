package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MASSOCTYPE;

public class MASSOCTYPERowMapper<T> implements RowMapper<MASSOCTYPE> {

	@Override
	public MASSOCTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MASSOCTYPE obj = new MASSOCTYPE();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setOID(rs.getString("OID"));
		obj.setMASSOCTYPE_ID(rs.getString("MASSOCTYPE_ID"));
		
		return obj;
	}

}
