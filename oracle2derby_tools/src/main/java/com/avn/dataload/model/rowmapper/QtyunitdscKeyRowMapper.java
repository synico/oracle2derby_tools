package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.QtyunitdscKey;

public class QtyunitdscKeyRowMapper<T> implements RowMapper<QtyunitdscKey> {

	@Override
	public QtyunitdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		QtyunitdscKey obj = new QtyunitdscKey();
		
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
