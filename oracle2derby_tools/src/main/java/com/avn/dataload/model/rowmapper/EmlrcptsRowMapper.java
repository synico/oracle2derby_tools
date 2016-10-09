package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlrcpts;

public class EmlrcptsRowMapper<T> implements RowMapper<Emlrcpts> {

	@Override
	public Emlrcpts mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlrcpts obj = new Emlrcpts();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setEmlpromoId(rs.getBigDecimal("EMLPROMO_ID"));
		obj.setCount(rs.getBigDecimal("COUNT"));
		obj.setRecipients(rs.getString("RECIPIENTS"));
		
		return obj;
	}

}
