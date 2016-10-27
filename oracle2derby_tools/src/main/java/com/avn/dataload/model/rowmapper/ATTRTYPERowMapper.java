package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTRTYPE;

public class ATTRTYPERowMapper<T> implements RowMapper<ATTRTYPE> {

    private static final Logger log = Logger.getLogger(ATTRTYPERowMapper.class);

	@Override
	public ATTRTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTRTYPE obj = new ATTRTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setOID(rs.getString("OID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
