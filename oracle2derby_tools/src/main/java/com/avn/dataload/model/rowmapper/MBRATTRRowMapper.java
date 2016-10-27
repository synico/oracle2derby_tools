package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRATTR;

public class MBRATTRRowMapper<T> implements RowMapper<MBRATTR> {

    private static final Logger log = Logger.getLogger(MBRATTRRowMapper.class);

	@Override
	public MBRATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRATTR obj = new MBRATTR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setMBRATTR_ID(rs.getBigDecimal("MBRATTR_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
