package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.GREVNTTYPE;

public class GREVNTTYPERowMapper<T> implements RowMapper<GREVNTTYPE> {

    private static final Logger log = Logger.getLogger(GREVNTTYPERowMapper.class);

	@Override
	public GREVNTTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		GREVNTTYPE obj = new GREVNTTYPE();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setEVENTTYPE_ID(rs.getBigDecimal("EVENTTYPE_ID"));
		obj.setEVENTTYPENAME(rs.getString("EVENTTYPENAME"));
		obj.setSORTORDER(rs.getBigDecimal("SORTORDER"));
		obj.setSTOREID(rs.getBigDecimal("STOREID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
