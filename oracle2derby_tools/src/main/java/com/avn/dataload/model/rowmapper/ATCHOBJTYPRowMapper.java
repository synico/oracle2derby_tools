package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHOBJTYP;

public class ATCHOBJTYPRowMapper<T> implements RowMapper<ATCHOBJTYP> {

    private static final Logger log = Logger.getLogger(ATCHOBJTYPRowMapper.class);

	@Override
	public ATCHOBJTYP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHOBJTYP obj = new ATCHOBJTYP();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATCHOBJTYP_ID(rs.getBigDecimal("ATCHOBJTYP_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
