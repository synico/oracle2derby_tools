package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.QtyfmtdescKey;

public class QtyfmtdescKeyRowMapper<T> implements RowMapper<QtyfmtdescKey> {

	@Override
	public QtyfmtdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		QtyfmtdescKey obj = new QtyfmtdescKey();
		
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setNumbrusgId(rs.getBigDecimal("NUMBRUSG_ID"));
		
		return obj;
	}

}
