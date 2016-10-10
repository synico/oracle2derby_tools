package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLMSG;

public class EMLMSGRowMapper<T> implements RowMapper<EMLMSG> {

	@Override
	public EMLMSG mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLMSG obj = new EMLMSG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setPROPERTYFILE(rs.getString("PROPERTYFILE"));
		obj.setEMLBODYTYPE(rs.getBigDecimal("EMLBODYTYPE"));
		obj.setEMLMSG_ID(rs.getBigDecimal("EMLMSG_ID"));
		obj.setJSPPATH(rs.getString("JSPPATH"));
		
		return obj;
	}

}
