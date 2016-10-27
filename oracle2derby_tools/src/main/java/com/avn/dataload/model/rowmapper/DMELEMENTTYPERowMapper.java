package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMELEMENTTYPE;

public class DMELEMENTTYPERowMapper<T> implements RowMapper<DMELEMENTTYPE> {

    private static final Logger log = Logger.getLogger(DMELEMENTTYPERowMapper.class);

	@Override
	public DMELEMENTTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMELEMENTTYPE obj = new DMELEMENTTYPE();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setDMELEMENTTYPE_ID(rs.getBigDecimal("DMELEMENTTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
