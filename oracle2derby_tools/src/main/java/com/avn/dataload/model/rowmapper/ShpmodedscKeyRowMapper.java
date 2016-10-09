package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.ShpmodedscKey;

public class ShpmodedscKeyRowMapper<T> implements RowMapper<ShpmodedscKey> {

	@Override
	public ShpmodedscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		ShpmodedscKey obj = new ShpmodedscKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setShipmodeId(rs.getBigDecimal("SHIPMODE_ID"));
		
		return obj;
	}

}
