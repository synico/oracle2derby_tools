package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.USERPROF;

public class USERPROFRowMapper<T> implements RowMapper<USERPROF> {

	@Override
	public USERPROF mapRow(ResultSet rs, int rowNum) throws SQLException {
		USERPROF obj = new USERPROF();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setPREFERREDCOMM(rs.getString("PREFERREDCOMM"));
		obj.setPREFERREDMEASURE(rs.getString("PREFERREDMEASURE"));
		obj.setRCVSMSNOTIFICATION(rs.getBigDecimal("RCVSMSNOTIFICATION"));
		obj.setPHOTO(rs.getString("PHOTO"));
		obj.setPREFERREDDELIVERY(rs.getString("PREFERREDDELIVERY"));
		obj.setTAXPAYERID(rs.getString("TAXPAYERID"));
		
		return obj;
	}

}
