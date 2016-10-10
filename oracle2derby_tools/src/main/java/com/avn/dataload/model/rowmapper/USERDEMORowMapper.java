package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.USERDEMO;

public class USERDEMORowMapper<T> implements RowMapper<USERDEMO> {

	@Override
	public USERDEMO mapRow(ResultSet rs, int rowNum) throws SQLException {
		USERDEMO obj = new USERDEMO();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setFIELD5(rs.getString("FIELD5"));
		obj.setMARITALSTATUS(rs.getString("MARITALSTATUS"));
		obj.setINCOMECURRENCY(rs.getString("INCOMECURRENCY"));
		obj.setCOMPANYNAME(rs.getString("COMPANYNAME"));
		obj.setORDERBEFORE(rs.getString("ORDERBEFORE"));
		obj.setDATEOFBIRTH(rs.getTimestamp("DATEOFBIRTH"));
		obj.setGENDER(rs.getString("GENDER"));
		obj.setAGE(rs.getBigDecimal("AGE"));
		obj.setINCOME(rs.getBigDecimal("INCOME"));
		obj.setCHILDREN(rs.getBigDecimal("CHILDREN"));
		obj.setHOUSEHOLD(rs.getBigDecimal("HOUSEHOLD"));
		obj.setHOBBIES(rs.getString("HOBBIES"));
		obj.setTIMEZONE(rs.getString("TIMEZONE"));
		obj.setFIELD7(rs.getString("FIELD7"));
		obj.setFIELD6(rs.getBigDecimal("FIELD6"));
		
		return obj;
	}

}
