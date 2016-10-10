package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATRELTYPE;

public class CATRELTYPERowMapper<T> implements RowMapper<CATRELTYPE> {

	@Override
	public CATRELTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATRELTYPE obj = new CATRELTYPE();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCATRELTYPE_ID(rs.getString("CATRELTYPE_ID"));
		
		return obj;
	}

}
