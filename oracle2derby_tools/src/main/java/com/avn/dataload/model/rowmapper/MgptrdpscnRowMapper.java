package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mgptrdpscn;

public class MgptrdpscnRowMapper<T> implements RowMapper<Mgptrdpscn> {

	@Override
	public Mgptrdpscn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mgptrdpscn obj = new Mgptrdpscn();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
