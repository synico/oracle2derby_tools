package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMSPOT;

public class EMSPOTRowMapper<T> implements RowMapper<EMSPOT> {

	@Override
	public EMSPOT mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMSPOT obj = new EMSPOT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSUPPORTEDTYPES(rs.getString("SUPPORTEDTYPES"));
		obj.setDEFAULTRULE(rs.getString("DEFAULTRULE"));
		obj.setEMSPOT_ID(rs.getBigDecimal("EMSPOT_ID"));
		obj.setUIDISPLAYABLE(rs.getBigDecimal("UIDISPLAYABLE"));
		obj.setMANAGINGTOOL(rs.getBigDecimal("MANAGINGTOOL"));
		obj.setLASTUPDATEDBY(rs.getString("LASTUPDATEDBY"));
		obj.setUSAGETYPE(rs.getString("USAGETYPE"));
		
		return obj;
	}

}
