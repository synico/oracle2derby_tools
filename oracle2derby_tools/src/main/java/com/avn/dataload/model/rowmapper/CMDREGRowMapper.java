package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMDREG;

public class CMDREGRowMapper<T> implements RowMapper<CMDREG> {

    private static final Logger log = Logger.getLogger(CMDREGRowMapper.class);

	@Override
	public CMDREG mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMDREG obj = new CMDREG();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCLASSNAME(rs.getString("CLASSNAME"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setTARGET(rs.getString("TARGET"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setINTERFACENAME(rs.getString("INTERFACENAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
