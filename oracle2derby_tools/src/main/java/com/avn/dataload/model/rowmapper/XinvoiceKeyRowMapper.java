package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XinvoiceKey;

public class XinvoiceKeyRowMapper<T> implements RowMapper<XinvoiceKey> {

	@Override
	public XinvoiceKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XinvoiceKey obj = new XinvoiceKey();
		
		obj.setOrdreleasenum(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setXinvoiceId(rs.getBigDecimal("XINVOICE_ID"));
		
		return obj;
	}

}
