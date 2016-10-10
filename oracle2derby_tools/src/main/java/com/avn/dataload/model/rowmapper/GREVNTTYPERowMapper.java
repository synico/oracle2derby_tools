package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.GREVNTTYPE;

public class GREVNTTYPERowMapper<T> implements RowMapper<GREVNTTYPE> {

	@Override
	public GREVNTTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		GREVNTTYPE obj = new GREVNTTYPE();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSORTORDER(rs.getBigDecimal("SORTORDER"));
		obj.setSTOREID(rs.getBigDecimal("STOREID"));
		obj.setEVENTTYPE_ID(rs.getBigDecimal("EVENTTYPE_ID"));
		obj.setEVENTTYPENAME(rs.getString("EVENTTYPENAME"));
		
		return obj;
	}

}
