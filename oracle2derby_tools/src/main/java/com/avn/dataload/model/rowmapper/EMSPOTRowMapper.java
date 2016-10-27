package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMSPOT;

public class EMSPOTRowMapper<T> implements RowMapper<EMSPOT> {

    private static final Logger log = Logger.getLogger(EMSPOTRowMapper.class);

	@Override
	public EMSPOT mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMSPOT obj = new EMSPOT();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setUIDISPLAYABLE(rs.getBigDecimal("UIDISPLAYABLE"));
		obj.setMANAGINGTOOL(rs.getBigDecimal("MANAGINGTOOL"));
		obj.setUSAGETYPE(rs.getString("USAGETYPE"));
		obj.setLASTUPDATEDBY(rs.getString("LASTUPDATEDBY"));
		obj.setSUPPORTEDTYPES(rs.getString("SUPPORTEDTYPES"));
		obj.setDEFAULTRULE(rs.getString("DEFAULTRULE"));
		obj.setEMSPOT_ID(rs.getBigDecimal("EMSPOT_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
