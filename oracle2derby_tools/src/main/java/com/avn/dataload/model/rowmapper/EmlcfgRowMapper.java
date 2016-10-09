package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlcfg;

public class EmlcfgRowMapper<T> implements RowMapper<Emlcfg> {

	@Override
	public Emlcfg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlcfg obj = new Emlcfg();
		
		obj.setName(rs.getString("NAME"));
		obj.setTime(rs.getBigDecimal("TIME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setType(rs.getBigDecimal("TYPE"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setAccount(rs.getString("ACCOUNT"));
		obj.setEmlcfgId(rs.getBigDecimal("EMLCFG_ID"));
		obj.setHost(rs.getString("HOST"));
		obj.setEmlserver(rs.getString("EMLSERVER"));
		obj.setPort(rs.getBigDecimal("PORT"));
		obj.setAddress(rs.getString("ADDRESS"));
		obj.setPassword(rs.getbyte[]("PASSWORD"));
		
		return obj;
	}

}
