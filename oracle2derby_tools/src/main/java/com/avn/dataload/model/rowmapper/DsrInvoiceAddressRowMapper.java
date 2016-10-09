package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DsrInvoiceAddress;

public class DsrInvoiceAddressRowMapper<T> implements RowMapper<DsrInvoiceAddress> {

	@Override
	public DsrInvoiceAddress mapRow(ResultSet rs, int rowNum) throws SQLException {
		DsrInvoiceAddress obj = new DsrInvoiceAddress();
		
		obj.setLastUpdateAction(rs.getString("LAST_UPDATE_ACTION"));
		obj.setAuditLogKey(rs.getLong("AUDIT_LOG_KEY"));
		obj.setInvoiceCompany(rs.getString("INVOICE_COMPANY"));
		obj.setInvoiceSeqNbr(rs.getString("INVOICE_SEQ_NBR"));
		obj.setInvoiceNbr(rs.getString("INVOICE_NBR"));
		obj.setCreateDt(rs.getDate("CREATE_DT"));
		obj.setUpdateDt(rs.getDate("UPDATE_DT"));
		obj.setDeleteDt(rs.getDate("DELETE_DT"));
		obj.setUpdateId(rs.getString("UPDATE_ID"));
		obj.setSystemId(rs.getString("SYSTEM_ID"));
		obj.setSegRcvdDt(rs.getDate("SEG_RCVD_DT"));
		obj.setDivisionId(rs.getString("DIVISION_ID"));
		obj.setBilltoCity(rs.getString("BILLTO_CITY"));
		obj.setShiptoCity(rs.getString("SHIPTO_CITY"));
		obj.setBilltoCustName(rs.getString("BILLTO_CUST_NAME"));
		obj.setBilltoAttnName(rs.getString("BILLTO_ATTN_NAME"));
		obj.setBilltoAddr1(rs.getString("BILLTO_ADDR1"));
		obj.setBilltoAddr2(rs.getString("BILLTO_ADDR2"));
		obj.setBilltoAddr3(rs.getString("BILLTO_ADDR3"));
		obj.setBilltoState(rs.getString("BILLTO_STATE"));
		obj.setBilltoPostZip(rs.getString("BILLTO_POST_ZIP"));
		obj.setBilltoCntry(rs.getString("BILLTO_CNTRY"));
		obj.setShiptoCustName(rs.getString("SHIPTO_CUST_NAME"));
		obj.setShiptoAttnName(rs.getString("SHIPTO_ATTN_NAME"));
		obj.setShiptoAddr1(rs.getString("SHIPTO_ADDR1"));
		obj.setShiptoAddr2(rs.getString("SHIPTO_ADDR2"));
		obj.setShiptoAddr3(rs.getString("SHIPTO_ADDR3"));
		obj.setShiptoState(rs.getString("SHIPTO_STATE"));
		obj.setShiptoPostZip(rs.getString("SHIPTO_POST_ZIP"));
		obj.setShiptoCntry(rs.getString("SHIPTO_CNTRY"));
		
		return obj;
	}

}
