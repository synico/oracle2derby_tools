package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMUSERBHVR;

public class DMUSERBHVRRowMapper<T> implements RowMapper<DMUSERBHVR> {

	@Override
	public DMUSERBHVR mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMUSERBHVR obj = new DMUSERBHVR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACTION(rs.getClob("ACTION"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setBEHAVIOR(rs.getClob("BEHAVIOR"));
		obj.setEVENT(rs.getClob("EVENT"));
		obj.setPERSONALIZATIONID(rs.getString("PERSONALIZATIONID"));
		obj.setLASTUPDATED(rs.getTimestamp("LASTUPDATED"));
		
		return obj;
	}

}
