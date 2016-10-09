package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catgpcalcd;

public class CatgpcalcdRowMapper<T> implements RowMapper<Catgpcalcd> {

	@Override
	public Catgpcalcd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catgpcalcd obj = new Catgpcalcd();
		
		obj.setCalcodeId(rs.getBigDecimal("CALCODE_ID"));
		obj.setCatgpcalcdId(rs.getBigDecimal("CATGPCALCD_ID"));
		obj.setTradingId(rs.getBigDecimal("TRADING_ID"));
		obj.setCalflags(rs.getBigDecimal("CALFLAGS"));
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		
		return obj;
	}

}
