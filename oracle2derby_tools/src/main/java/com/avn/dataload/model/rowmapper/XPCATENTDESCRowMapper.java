package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XPCATENTDESC;

public class XPCATENTDESCRowMapper<T> implements RowMapper<XPCATENTDESC> {

    private static final Logger log = Logger.getLogger(XPCATENTDESCRowMapper.class);

	@Override
	public XPCATENTDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		XPCATENTDESC obj = new XPCATENTDESC();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setPRODUCTAPPLICATIONS(rs.getString("PRODUCTAPPLICATIONS"));
		obj.setKITINCLUDE(rs.getString("KITINCLUDE"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
