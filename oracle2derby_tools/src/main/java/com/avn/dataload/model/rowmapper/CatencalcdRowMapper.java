package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catencalcd;

public class CatencalcdRowMapper<T> implements RowMapper<Catencalcd> {

	@Override
	public Catencalcd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catencalcd obj = new Catencalcd();
		
		obj.setCalcodeId(rs.getBigDecimal("CALCODE_ID"));
		obj.setCatencalcdId(rs.getBigDecimal("CATENCALCD_ID"));
		obj.setTradingId(rs.getBigDecimal("TRADING_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setCalflags(rs.getBigDecimal("CALFLAGS"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		
		return obj;
	}

}
