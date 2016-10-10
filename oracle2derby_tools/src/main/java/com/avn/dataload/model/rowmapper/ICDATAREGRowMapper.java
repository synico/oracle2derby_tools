package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ICDATAREG;

public class ICDATAREGRowMapper<T> implements RowMapper<ICDATAREG> {

	@Override
	public ICDATAREG mapRow(ResultSet rs, int rowNum) throws SQLException {
		ICDATAREG obj = new ICDATAREG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setCLASSNAME(rs.getString("CLASSNAME"));
		obj.setREFID(rs.getBigDecimal("REFID"));
		obj.setBASETYPE(rs.getString("BASETYPE"));
		obj.setORDERSEQ(rs.getBigDecimal("ORDERSEQ"));
		obj.setDEFAULTTYPE(rs.getBigDecimal("DEFAULTTYPE"));
		
		return obj;
	}

}
