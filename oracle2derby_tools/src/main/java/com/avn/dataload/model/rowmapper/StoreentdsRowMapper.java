package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storeentds;

public class StoreentdsRowMapper<T> implements RowMapper<Storeentds> {

	@Override
	public Storeentds mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storeentds obj = new Storeentds();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setStaddressIdLoc(rs.getBigDecimal("STADDRESS_ID_LOC"));
		obj.setStaddressIdCont(rs.getBigDecimal("STADDRESS_ID_CONT"));
		
		return obj;
	}

}
