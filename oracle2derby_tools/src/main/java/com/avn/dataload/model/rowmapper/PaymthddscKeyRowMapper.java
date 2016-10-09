package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PaymthddscKey;

public class PaymthddscKeyRowMapper<T> implements RowMapper<PaymthddscKey> {

	@Override
	public PaymthddscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PaymthddscKey obj = new PaymthddscKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPaymthdId(rs.getBigDecimal("PAYMTHD_ID"));
		
		return obj;
	}

}
