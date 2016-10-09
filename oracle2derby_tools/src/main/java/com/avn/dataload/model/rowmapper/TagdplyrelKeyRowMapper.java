package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.TagdplyrelKey;

public class TagdplyrelKeyRowMapper<T> implements RowMapper<TagdplyrelKey> {

	@Override
	public TagdplyrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		TagdplyrelKey obj = new TagdplyrelKey();
		
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setTagname(rs.getString("TAGNAME"));
		
		return obj;
	}

}
