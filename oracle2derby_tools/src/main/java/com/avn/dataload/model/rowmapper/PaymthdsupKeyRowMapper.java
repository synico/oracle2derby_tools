package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PaymthdsupKey;

public class PaymthdsupKeyRowMapper<T> implements RowMapper<PaymthdsupKey> {

	@Override
	public PaymthdsupKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PaymthdsupKey obj = new PaymthdsupKey();
		
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setPaymthdId(rs.getBigDecimal("PAYMTHD_ID"));
		
		return obj;
	}

}
