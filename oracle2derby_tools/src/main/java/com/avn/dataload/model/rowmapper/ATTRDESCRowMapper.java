package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTRDESC;

public class ATTRDESCRowMapper<T> implements RowMapper<ATTRDESC> {

	@Override
	public ATTRDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTRDESC obj = new ATTRDESC();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setGROUPNAME(rs.getString("GROUPNAME"));
		obj.setNAME(rs.getString("NAME"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setDESCRIPTION2(rs.getString("DESCRIPTION2"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setATTR_ID(rs.getBigDecimal("ATTR_ID"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setNOTEINFO(rs.getString("NOTEINFO"));
		
		return obj;
	}

}
