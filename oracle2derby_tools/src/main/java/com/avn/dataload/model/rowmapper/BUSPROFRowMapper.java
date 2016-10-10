package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUSPROF;

public class BUSPROFRowMapper<T> implements RowMapper<BUSPROF> {

	@Override
	public BUSPROF mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUSPROF obj = new BUSPROF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setEMPLOYEEID(rs.getString("EMPLOYEEID"));
		obj.setORG_ID(rs.getBigDecimal("ORG_ID"));
		obj.setORGUNIT_ID(rs.getBigDecimal("ORGUNIT_ID"));
		obj.setMANAGER(rs.getString("MANAGER"));
		obj.setSECRETARY(rs.getString("SECRETARY"));
		obj.setEMPLOYEETYPE(rs.getString("EMPLOYEETYPE"));
		obj.setDEPARTMENTNUM(rs.getString("DEPARTMENTNUM"));
		obj.setALTERNATEID(rs.getString("ALTERNATEID"));
		obj.setREQUISITIONERID(rs.getString("REQUISITIONERID"));
		
		return obj;
	}

}
