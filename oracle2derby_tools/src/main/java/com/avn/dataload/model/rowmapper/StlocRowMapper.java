package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Stloc;

public class StlocRowMapper<T> implements RowMapper<Stloc> {

	@Override
	public Stloc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Stloc obj = new Stloc();
		
		obj.setState(rs.getString("STATE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAddress1(rs.getString("ADDRESS1"));
		obj.setAddress2(rs.getString("ADDRESS2"));
		obj.setAddress3(rs.getString("ADDRESS3"));
		obj.setCity(rs.getString("CITY"));
		obj.setCountry(rs.getString("COUNTRY"));
		obj.setZipcode(rs.getString("ZIPCODE"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setStlocId(rs.getBigDecimal("STLOC_ID"));
		obj.setPhone(rs.getString("PHONE"));
		obj.setFax(rs.getString("FAX"));
		obj.setActive(rs.getBigDecimal("ACTIVE"));
		obj.setLatitude(rs.getBigDecimal("LATITUDE"));
		obj.setLongitude(rs.getBigDecimal("LONGITUDE"));
		obj.setGeonodeId(rs.getBigDecimal("GEONODE_ID"));
		
		return obj;
	}

}
