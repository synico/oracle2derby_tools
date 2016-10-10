package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMACTIVITY;

public class DMACTIVITYRowMapper<T> implements RowMapper<DMACTIVITY> {

	@Override
	public DMACTIVITY mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMACTIVITY obj = new DMACTIVITY();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setPUBLISHED(rs.getBigDecimal("PUBLISHED"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setBEHAVIOR(rs.getBigDecimal("BEHAVIOR"));
		obj.setVERSION(rs.getBigDecimal("VERSION"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		obj.setREPEATABLE(rs.getBigDecimal("REPEATABLE"));
		obj.setCREATED(rs.getTimestamp("CREATED"));
		obj.setFLOWXML(rs.getClob("FLOWXML"));
		obj.setUIDISPLAYABLE(rs.getBigDecimal("UIDISPLAYABLE"));
		obj.setMANAGINGTOOL(rs.getBigDecimal("MANAGINGTOOL"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setDMCAMPAIGN_ID(rs.getBigDecimal("DMCAMPAIGN_ID"));
		obj.setDMACTTYPE_ID(rs.getBigDecimal("DMACTTYPE_ID"));
		obj.setDMTEMPLATETYPE_ID(rs.getBigDecimal("DMTEMPLATETYPE_ID"));
		obj.setDMEXPTYPE_ID(rs.getBigDecimal("DMEXPTYPE_ID"));
		obj.setLASTUPDATEDBY(rs.getString("LASTUPDATEDBY"));
		
		return obj;
	}

}
