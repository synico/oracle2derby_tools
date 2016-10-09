package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Jurst;

public class JurstRowMapper<T> implements RowMapper<Jurst> {

	@Override
	public Jurst mapRow(ResultSet rs, int rowNum) throws SQLException {
		Jurst obj = new Jurst();
		
		obj.setState(rs.getString("STATE"));
		obj.setCode(rs.getString("CODE"));
		obj.setSubclass(rs.getBigDecimal("SUBCLASS"));
		obj.setZipcodestart(rs.getString("ZIPCODESTART"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCity(rs.getString("CITY"));
		obj.setCountry(rs.getString("COUNTRY"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setJurstId(rs.getBigDecimal("JURST_ID"));
		obj.setStateabbr(rs.getString("STATEABBR"));
		obj.setDistrict(rs.getString("DISTRICT"));
		obj.setCounty(rs.getString("COUNTY"));
		obj.setZipcodeend(rs.getString("ZIPCODEEND"));
		obj.setGeocode(rs.getString("GEOCODE"));
		obj.setCountryabbr(rs.getString("COUNTRYABBR"));
		
		return obj;
	}

}
