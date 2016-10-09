package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plcyacct;

public class PlcyacctRowMapper<T> implements RowMapper<Plcyacct> {

	@Override
	public Plcyacct mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plcyacct obj = new Plcyacct();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPlcyacclckId(rs.getBigDecimal("PLCYACCLCK_ID"));
		obj.setPlcypasswdId(rs.getBigDecimal("PLCYPASSWD_ID"));
		obj.setPlcyacctId(rs.getBigDecimal("PLCYACCT_ID"));
		
		return obj;
	}

}
