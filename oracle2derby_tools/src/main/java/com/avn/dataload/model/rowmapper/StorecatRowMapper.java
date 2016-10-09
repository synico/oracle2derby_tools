package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storecat;

public class StorecatRowMapper<T> implements RowMapper<Storecat> {

	@Override
	public Storecat mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storecat obj = new Storecat();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setMastercatalog(rs.getString("MASTERCATALOG"));
		
		return obj;
	}

}
