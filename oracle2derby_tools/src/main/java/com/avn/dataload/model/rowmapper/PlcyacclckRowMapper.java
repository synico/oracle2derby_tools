package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plcyacclck;

public class PlcyacclckRowMapper<T> implements RowMapper<Plcyacclck> {

	@Override
	public Plcyacclck mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plcyacclck obj = new Plcyacclck();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPlcyacclckId(rs.getBigDecimal("PLCYACCLCK_ID"));
		obj.setLockoutthreshold(rs.getBigDecimal("LOCKOUTTHRESHOLD"));
		obj.setWaittime(rs.getBigDecimal("WAITTIME"));
		
		return obj;
	}

}
