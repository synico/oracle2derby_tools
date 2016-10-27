package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TCSUBTYPE;

public class TCSUBTYPERowMapper<T> implements RowMapper<TCSUBTYPE> {

    private static final Logger log = Logger.getLogger(TCSUBTYPERowMapper.class);

	@Override
	public TCSUBTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		TCSUBTYPE obj = new TCSUBTYPE();
		
		obj.setACCESSBEANNAME(rs.getString("ACCESSBEANNAME"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTCTYPE_ID(rs.getString("TCTYPE_ID"));
		obj.setTCSUBTYPE_ID(rs.getString("TCSUBTYPE_ID"));
		obj.setDEPLOYCOMMAND(rs.getString("DEPLOYCOMMAND"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
