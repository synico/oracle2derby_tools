package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ICDATAREG;

public class ICDATAREGRowMapper<T> implements RowMapper<ICDATAREG> {

    private static final Logger log = Logger.getLogger(ICDATAREGRowMapper.class);

	@Override
	public ICDATAREG mapRow(ResultSet rs, int rowNum) throws SQLException {
		ICDATAREG obj = new ICDATAREG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCLASSNAME(rs.getString("CLASSNAME"));
		obj.setDEFAULTTYPE(rs.getBigDecimal("DEFAULTTYPE"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setREFID(rs.getBigDecimal("REFID"));
		obj.setBASETYPE(rs.getString("BASETYPE"));
		obj.setORDERSEQ(rs.getBigDecimal("ORDERSEQ"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
