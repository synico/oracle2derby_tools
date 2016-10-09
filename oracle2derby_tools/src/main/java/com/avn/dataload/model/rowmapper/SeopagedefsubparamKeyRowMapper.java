package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.SeopagedefsubparamKey;

public class SeopagedefsubparamKeyRowMapper<T> implements RowMapper<SeopagedefsubparamKey> {

	@Override
	public SeopagedefsubparamKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		SeopagedefsubparamKey obj = new SeopagedefsubparamKey();
		
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSubparamname(rs.getString("SUBPARAMNAME"));
		
		return obj;
	}

}
