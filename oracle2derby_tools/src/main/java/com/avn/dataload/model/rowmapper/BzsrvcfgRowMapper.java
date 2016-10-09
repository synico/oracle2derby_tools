package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Bzsrvcfg;

public class BzsrvcfgRowMapper<T> implements RowMapper<Bzsrvcfg> {

	@Override
	public Bzsrvcfg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bzsrvcfg obj = new Bzsrvcfg();
		
		obj.setBzsrvcfgId(rs.getBigDecimal("BZSRVCFG_ID"));
		obj.setServername(rs.getString("SERVERNAME"));
		obj.setEnabled(rs.getBigDecimal("ENABLED"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
