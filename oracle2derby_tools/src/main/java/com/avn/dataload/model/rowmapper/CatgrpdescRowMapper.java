package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catgrpdesc;

public class CatgrpdescRowMapper<T> implements RowMapper<Catgrpdesc> {

	@Override
	public Catgrpdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catgrpdesc obj = new Catgrpdesc();
		
		obj.setName(rs.getString("NAME"));
		obj.setShortdescription(rs.getString("SHORTDESCRIPTION"));
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setPublished(rs.getBigDecimal("PUBLISHED"));
		obj.setThumbnail(rs.getString("THUMBNAIL"));
		obj.setFullimage(rs.getString("FULLIMAGE"));
		obj.setKeyword(rs.getString("KEYWORD"));
		obj.setDisplay(rs.getString("DISPLAY"));
		obj.setNote(rs.getString("NOTE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
