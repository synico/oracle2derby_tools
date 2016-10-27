package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MSGTYPES;

public class MSGTYPESRowMapper<T> implements RowMapper<MSGTYPES> {

    private static final Logger log = Logger.getLogger(MSGTYPESRowMapper.class);

	@Override
	public MSGTYPES mapRow(ResultSet rs, int rowNum) throws SQLException {
		MSGTYPES obj = new MSGTYPES();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setVIEWNAME(rs.getString("VIEWNAME"));
		obj.setMSGTYPE_ID(rs.getBigDecimal("MSGTYPE_ID"));
		obj.setMSGTDIR(rs.getBigDecimal("MSGTDIR"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
