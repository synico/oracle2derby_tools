package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catentdesc;

public class CatentdescRowMapper<T> implements RowMapper<Catentdesc> {

	@Override
	public Catentdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catentdesc obj = new Catentdesc();
		
		obj.setName(rs.getString("NAME"));
		obj.setShortdescription(rs.getString("SHORTDESCRIPTION"));
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setPublished(rs.getBigDecimal("PUBLISHED"));
		obj.setAuxdescription1(rs.getString("AUXDESCRIPTION1"));
		obj.setAuxdescription2(rs.getString("AUXDESCRIPTION2"));
		obj.setAvailabilitydate(rs.getDate("AVAILABILITYDATE"));
		obj.setThumbnail(rs.getString("THUMBNAIL"));
		obj.setFullimage(rs.getString("FULLIMAGE"));
		obj.setXmldetail(rs.getString("XMLDETAIL"));
		obj.setAvailable(rs.getBigDecimal("AVAILABLE"));
		obj.setKeyword(rs.getString("KEYWORD"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
