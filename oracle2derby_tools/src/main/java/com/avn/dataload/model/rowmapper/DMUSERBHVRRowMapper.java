package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMUSERBHVR;

public class DMUSERBHVRRowMapper<T> implements RowMapper<DMUSERBHVR> {

    private static final Logger log = Logger.getLogger(DMUSERBHVRRowMapper.class);

	@Override
	public DMUSERBHVR mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMUSERBHVR obj = new DMUSERBHVR();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACTION(rs.getClob("ACTION"));
		obj.setEVENT(rs.getClob("EVENT"));
		obj.setPERSONALIZATIONID(rs.getString("PERSONALIZATIONID"));
		obj.setLASTUPDATED(rs.getTimestamp("LASTUPDATED"));
		obj.setBEHAVIOR(rs.getClob("BEHAVIOR"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
