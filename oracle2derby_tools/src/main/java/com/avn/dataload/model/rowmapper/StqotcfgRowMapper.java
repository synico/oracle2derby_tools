package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Stqotcfg;

public class StqotcfgRowMapper<T> implements RowMapper<Stqotcfg> {

	@Override
	public Stqotcfg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Stqotcfg obj = new Stqotcfg();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setCsrexpireperiod(rs.getBigDecimal("CSREXPIREPERIOD"));
		obj.setCssexpireperiod(rs.getBigDecimal("CSSEXPIREPERIOD"));
		obj.setExpireperiod(rs.getBigDecimal("EXPIREPERIOD"));
		obj.setRetireflag(rs.getBigDecimal("RETIREFLAG"));
		
		return obj;
	}

}
