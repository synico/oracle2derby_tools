package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMCAMPAIGN;

public class DMCAMPAIGNRowMapper<T> implements RowMapper<DMCAMPAIGN> {

    private static final Logger log = Logger.getLogger(DMCAMPAIGNRowMapper.class);

	@Override
	public DMCAMPAIGN mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMCAMPAIGN obj = new DMCAMPAIGN();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setDMCAMPAIGN_ID(rs.getBigDecimal("DMCAMPAIGN_ID"));
		obj.setLASTUPDATEDBY(rs.getString("LASTUPDATEDBY"));
		obj.setCREATED(rs.getTimestamp("CREATED"));
		obj.setSEASON(rs.getString("SEASON"));
		obj.setOWNER(rs.getString("OWNER"));
		obj.setOBJECTIVE(rs.getString("OBJECTIVE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
