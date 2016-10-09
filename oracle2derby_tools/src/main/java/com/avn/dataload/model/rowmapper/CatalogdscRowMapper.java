package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catalogdsc;

public class CatalogdscRowMapper<T> implements RowMapper<Catalogdsc> {

	@Override
	public Catalogdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catalogdsc obj = new Catalogdsc();
		
		obj.setName(rs.getString("NAME"));
		obj.setShortdescription(rs.getString("SHORTDESCRIPTION"));
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setThumbnail(rs.getString("THUMBNAIL"));
		obj.setFullimage(rs.getString("FULLIMAGE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
