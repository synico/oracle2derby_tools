package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catentship;

public class CatentshipRowMapper<T> implements RowMapper<Catentship> {

	@Override
	public Catentship mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catentship obj = new Catentship();
		
		obj.setLength(rs.getBigDecimal("LENGTH"));
		obj.setQuantitymeasure(rs.getString("QUANTITYMEASURE"));
		obj.setQuantitymultiple(rs.getBigDecimal("QUANTITYMULTIPLE"));
		obj.setWeightmeasure(rs.getString("WEIGHTMEASURE"));
		obj.setSizemeasure(rs.getString("SIZEMEASURE"));
		obj.setNominalquantity(rs.getBigDecimal("NOMINALQUANTITY"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setWeight(rs.getBigDecimal("WEIGHT"));
		obj.setWidth(rs.getBigDecimal("WIDTH"));
		obj.setHeight(rs.getBigDecimal("HEIGHT"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
