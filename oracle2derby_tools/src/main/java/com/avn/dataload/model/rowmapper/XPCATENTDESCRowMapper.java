package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XPCATENTDESC;

public class XPCATENTDESCRowMapper<T> implements RowMapper<XPCATENTDESC> {

	@Override
	public XPCATENTDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		XPCATENTDESC obj = new XPCATENTDESC();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setKITINCLUDE(rs.getString("KITINCLUDE"));
		obj.setPRODUCTAPPLICATIONS(rs.getString("PRODUCTAPPLICATIONS"));
		
		return obj;
	}

}
