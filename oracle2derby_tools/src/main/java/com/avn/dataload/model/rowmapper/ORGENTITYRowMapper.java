package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORGENTITY;

public class ORGENTITYRowMapper<T> implements RowMapper<ORGENTITY> {

	@Override
	public ORGENTITY mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORGENTITY obj = new ORGENTITY();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setDN(rs.getString("DN"));
		obj.setORGENTITYTYPE(rs.getString("ORGENTITYTYPE"));
		obj.setORGENTITYNAME(rs.getString("ORGENTITYNAME"));
		obj.setBUSINESSCATEGORY(rs.getString("BUSINESSCATEGORY"));
		obj.setADMINFIRSTNAME(rs.getString("ADMINFIRSTNAME"));
		obj.setADMINLASTNAME(rs.getString("ADMINLASTNAME"));
		obj.setADMINMIDDLENAME(rs.getString("ADMINMIDDLENAME"));
		obj.setPREFERREDDELIVERY(rs.getString("PREFERREDDELIVERY"));
		obj.setLEGALID(rs.getString("LEGALID"));
		obj.setTAXPAYERID(rs.getString("TAXPAYERID"));
		
		return obj;
	}

}
