package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Icdatareg;

public class IcdataregRowMapper<T> implements RowMapper<Icdatareg> {

	@Override
	public Icdatareg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Icdatareg obj = new Icdatareg();
		
		obj.setDefaulttype(rs.getBigDecimal("DEFAULTTYPE"));
		obj.setClassname(rs.getString("CLASSNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setRefid(rs.getBigDecimal("REFID"));
		obj.setBasetype(rs.getString("BAYPE"));
		obj.setOrderseq(rs.getBigDecimal("ORDERSEQ"));
		
		return obj;
	}

}
