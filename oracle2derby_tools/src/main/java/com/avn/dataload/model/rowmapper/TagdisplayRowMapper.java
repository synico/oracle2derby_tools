package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Tagdisplay;

public class TagdisplayRowMapper<T> implements RowMapper<Tagdisplay> {

	@Override
	public Tagdisplay mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tagdisplay obj = new Tagdisplay();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setThumbnailpath(rs.getString("THUMBNAILPATH"));
		obj.setJsppath(rs.getString("JSPPATH"));
		
		return obj;
	}

}
