package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.EmlrptevtsKey;

public class EmlrptevtsKeyRowMapper<T> implements RowMapper<EmlrptevtsKey> {

	@Override
	public EmlrptevtsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmlrptevtsKey obj = new EmlrptevtsKey();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setEmlpromoId(rs.getBigDecimal("EMLPROMO_ID"));
		
		return obj;
	}

}
