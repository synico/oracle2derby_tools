package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.QtyformatKey;

public class QtyformatKeyRowMapper<T> implements RowMapper<QtyformatKey> {

	@Override
	public QtyformatKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		QtyformatKey obj = new QtyformatKey();
		
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setNumbrusgId(rs.getBigDecimal("NUMBRUSG_ID"));
		
		return obj;
	}

}
