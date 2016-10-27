package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.USERPROF;

public class USERPROFRowMapper<T> implements RowMapper<USERPROF> {

    private static final Logger log = Logger.getLogger(USERPROFRowMapper.class);

	@Override
	public USERPROF mapRow(ResultSet rs, int rowNum) throws SQLException {
		USERPROF obj = new USERPROF();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setPREFERREDDELIVERY(rs.getString("PREFERREDDELIVERY"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setPREFERREDCOMM(rs.getString("PREFERREDCOMM"));
		obj.setPREFERREDMEASURE(rs.getString("PREFERREDMEASURE"));
		obj.setRCVSMSNOTIFICATION(rs.getBigDecimal("RCVSMSNOTIFICATION"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setTAXPAYERID(rs.getString("TAXPAYERID"));
		obj.setPHOTO(rs.getString("PHOTO"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
