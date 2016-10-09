package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xbookmarks;

public class XbookmarksRowMapper<T> implements RowMapper<Xbookmarks> {

	@Override
	public Xbookmarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xbookmarks obj = new Xbookmarks();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setUrl(rs.getString("URL"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setOrganizationId(rs.getBigDecimal("ORGANIZATION_ID"));
		obj.setBookmarkType(rs.getString("BOOKMARK_TYPE"));
		obj.setTitle(rs.getString("TITLE"));
		obj.setBookmarkId(rs.getBigDecimal("BOOKMARK_ID"));
		
		return obj;
	}

}
