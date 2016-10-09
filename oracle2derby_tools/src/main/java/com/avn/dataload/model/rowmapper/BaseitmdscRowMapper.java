package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Baseitmdsc;

public class BaseitmdscRowMapper<T> implements RowMapper<Baseitmdsc> {

	@Override
	public Baseitmdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Baseitmdsc obj = new Baseitmdsc();
		
		obj.setShortdescription(rs.getString("SHORTDESCRIPTION"));
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		
		return obj;
	}

}
