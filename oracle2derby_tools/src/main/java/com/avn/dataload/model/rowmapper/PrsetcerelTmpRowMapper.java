package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PrsetcerelTmp;

public class PrsetcerelTmpRowMapper<T> implements RowMapper<PrsetcerelTmp> {

	@Override
	public PrsetcerelTmp mapRow(ResultSet rs, int rowNum) throws SQLException {
		PrsetcerelTmp obj = new PrsetcerelTmp();
		
		obj.setProductsetId(rs.getBigDecimal("PRODUCT_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
