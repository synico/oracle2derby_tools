package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMCAMPAIGN;

public class DMCAMPAIGNRowMapper<T> implements RowMapper<DMCAMPAIGN> {

	@Override
	public DMCAMPAIGN mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMCAMPAIGN obj = new DMCAMPAIGN();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setCREATED(rs.getTimestamp("CREATED"));
		obj.setSEASON(rs.getString("SEASON"));
		obj.setOWNER(rs.getString("OWNER"));
		obj.setOBJECTIVE(rs.getString("OBJECTIVE"));
		obj.setDMCAMPAIGN_ID(rs.getBigDecimal("DMCAMPAIGN_ID"));
		obj.setLASTUPDATEDBY(rs.getString("LASTUPDATEDBY"));
		
		return obj;
	}

}
