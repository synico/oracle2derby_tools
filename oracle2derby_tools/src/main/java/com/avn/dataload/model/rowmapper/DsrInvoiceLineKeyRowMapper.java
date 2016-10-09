package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DsrInvoiceLineKey;

public class DsrInvoiceLineKeyRowMapper<T> implements RowMapper<DsrInvoiceLineKey> {

	@Override
	public DsrInvoiceLineKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		DsrInvoiceLineKey obj = new DsrInvoiceLineKey();
		
		obj.setInvoiceNbr(rs.getString("INVOICE_NBR"));
		obj.setLineItemNbr(rs.getString("LINE_ITEM_NBR"));
		
		return obj;
	}

}
