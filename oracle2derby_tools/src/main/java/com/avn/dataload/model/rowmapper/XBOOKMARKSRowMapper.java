package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XBOOKMARKS;

public class XBOOKMARKSRowMapper<T> implements RowMapper<XBOOKMARKS> {

	@Override
	public XBOOKMARKS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XBOOKMARKS obj = new XBOOKMARKS();
		
		obj.setURL(rs.getString("URL"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setBOOKMARK_ID(rs.getBigDecimal("BOOKMARK_ID"));
		obj.setORGANIZATION_ID(rs.getBigDecimal("ORGANIZATION_ID"));
		obj.setBOOKMARK_TYPE(rs.getString("BOOKMARK_TYPE"));
		obj.setTITLE(rs.getString("TITLE"));
		
		return obj;
	}

}
