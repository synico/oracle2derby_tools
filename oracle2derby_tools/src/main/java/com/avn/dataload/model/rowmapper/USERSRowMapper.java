package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.USERS;

public class USERSRowMapper<T> implements RowMapper<USERS> {

	@Override
	public USERS mapRow(ResultSet rs, int rowNum) throws SQLException {
		USERS obj = new USERS();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setDN(rs.getString("DN"));
		obj.setREGISTERTYPE(rs.getString("REGISTERTYPE"));
		obj.setPROFILETYPE(rs.getString("PROFILETYPE"));
		obj.setREGISTRATION(rs.getTimestamp("REGISTRATION"));
		obj.setLASTSESSION(rs.getTimestamp("LASTSESSION"));
		obj.setREGISTRATIONUPDATE(rs.getTimestamp("REGISTRATIONUPDATE"));
		obj.setREGISTRATIONCANCEL(rs.getTimestamp("REGISTRATIONCANCEL"));
		obj.setPREVLASTSESSION(rs.getTimestamp("PREVLASTSESSION"));
		obj.setLASTORDER(rs.getTimestamp("LASTORDER"));
		obj.setPERSONALIZATIONID(rs.getString("PERSONALIZATIONID"));
		
		return obj;
	}

}
