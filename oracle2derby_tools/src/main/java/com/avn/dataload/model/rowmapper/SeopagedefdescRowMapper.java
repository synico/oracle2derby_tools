package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Seopagedefdesc;

public class SeopagedefdescRowMapper<T> implements RowMapper<Seopagedefdesc> {

	@Override
	public Seopagedefdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Seopagedefdesc obj = new Seopagedefdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setCreatedtime(rs.getDate("CREATEDTIME"));
		obj.setMetaKeyword(rs.getString("META_KEYWORD"));
		obj.setImageAltDesc(rs.getString("IMAGE_ALT_DESC"));
		obj.setTitle(rs.getString("TITLE"));
		obj.setMetaDesc(rs.getString("META_DESC"));
		
		return obj;
	}

}
