package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlrptevts;

public class EmlrptevtsRowMapper<T> implements RowMapper<Emlrptevts> {

	@Override
	public Emlrptevts mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlrptevts obj = new Emlrptevts();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOpened(rs.getDate("OPENED"));
		obj.setClicked(rs.getDate("CLICKED"));
		obj.setBounced(rs.getDate("BOUNCED"));
		
		return obj;
	}

}
