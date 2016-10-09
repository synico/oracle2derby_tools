package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StencalusgKey;

public class StencalusgKeyRowMapper<T> implements RowMapper<StencalusgKey> {

	@Override
	public StencalusgKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StencalusgKey obj = new StencalusgKey();
		
		obj.setCalusageId(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
