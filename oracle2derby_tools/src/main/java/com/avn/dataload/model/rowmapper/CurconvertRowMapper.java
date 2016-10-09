package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Curconvert;

public class CurconvertRowMapper<T> implements RowMapper<Curconvert> {

	@Override
	public Curconvert mapRow(ResultSet rs, int rowNum) throws SQLException {
		Curconvert obj = new Curconvert();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setFromcurr(rs.getString("FROMCURR"));
		obj.setTocurr(rs.getString("TOCURR"));
		obj.setFactor(rs.getBigDecimal("FACTOR"));
		obj.setUpdatable(rs.getString("UPDATABLE"));
		obj.setCurconvertId(rs.getBigDecimal("CURCONVERT_ID"));
		obj.setMultiplyordivide(rs.getString("MULTIPLYORDIVIDE"));
		obj.setBidirectional(rs.getString("BIDIRECTIONAL"));
		
		return obj;
	}

}
