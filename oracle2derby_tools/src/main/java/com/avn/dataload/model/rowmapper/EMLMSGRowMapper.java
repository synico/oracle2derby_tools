package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLMSG;

public class EMLMSGRowMapper<T> implements RowMapper<EMLMSG> {

    private static final Logger log = Logger.getLogger(EMLMSGRowMapper.class);

	@Override
	public EMLMSG mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLMSG obj = new EMLMSG();
		
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setEMLMSG_ID(rs.getBigDecimal("EMLMSG_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setJSPPATH(rs.getString("JSPPATH"));
		obj.setPROPERTYFILE(rs.getString("PROPERTYFILE"));
		obj.setEMLBODYTYPE(rs.getBigDecimal("EMLBODYTYPE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
