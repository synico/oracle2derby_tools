package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CLEANCONF;

public class CLEANCONFRowMapper<T> implements RowMapper<CLEANCONF> {

	@Override
	public CLEANCONF mapRow(ResultSet rs, int rowNum) throws SQLException {
		CLEANCONF obj = new CLEANCONF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOBJECTNAME(rs.getString("OBJECTNAME"));
		obj.setSTATEMENT(rs.getString("STATEMENT"));
		obj.setNAMEARG(rs.getString("NAMEARG"));
		obj.setDAYSARG(rs.getString("DAYSARG"));
		obj.setSTATEMENTTYPE(rs.getString("STATEMENTTYPE"));
		
		return obj;
	}

}
