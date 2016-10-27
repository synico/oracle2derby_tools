package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DSR_INVOICE_ADDRESS;

public class DSR_INVOICE_ADDRESSRowMapper<T> implements RowMapper<DSR_INVOICE_ADDRESS> {

    private static final Logger log = Logger.getLogger(DSR_INVOICE_ADDRESSRowMapper.class);

	@Override
	public DSR_INVOICE_ADDRESS mapRow(ResultSet rs, int rowNum) throws SQLException {
		DSR_INVOICE_ADDRESS obj = new DSR_INVOICE_ADDRESS();
		
		obj.setBILLTO_CUST_NAME(rs.getString("BILLTO_CUST_NAME"));
		obj.setBILLTO_ATTN_NAME(rs.getString("BILLTO_ATTN_NAME"));
		obj.setBILLTO_ADDR1(rs.getString("BILLTO_ADDR1"));
		obj.setBILLTO_ADDR2(rs.getString("BILLTO_ADDR2"));
		obj.setCREATE_DT(rs.getTimestamp("CREATE_DT"));
		obj.setUPDATE_DT(rs.getTimestamp("UPDATE_DT"));
		obj.setDELETE_DT(rs.getTimestamp("DELETE_DT"));
		obj.setUPDATE_ID(rs.getString("UPDATE_ID"));
		obj.setSYSTEM_ID(rs.getString("SYSTEM_ID"));
		obj.setINVOICE_NBR(rs.getString("INVOICE_NBR"));
		obj.setLAST_UPDATE_ACTION(rs.getString("LAST_UPDATE_ACTION"));
		obj.setAUDIT_LOG_KEY(rs.getBigDecimal("AUDIT_LOG_KEY"));
		obj.setSEG_RCVD_DT(rs.getTimestamp("SEG_RCVD_DT"));
		obj.setDIVISION_ID(rs.getString("DIVISION_ID"));
		obj.setINVOICE_COMPANY(rs.getString("INVOICE_COMPANY"));
		obj.setINVOICE_SEQ_NBR(rs.getString("INVOICE_SEQ_NBR"));
		obj.setBILLTO_ADDR3(rs.getString("BILLTO_ADDR3"));
		obj.setBILLTO_CITY(rs.getString("BILLTO_CITY"));
		obj.setBILLTO_STATE(rs.getString("BILLTO_STATE"));
		obj.setBILLTO_POST_ZIP(rs.getString("BILLTO_POST_ZIP"));
		obj.setBILLTO_CNTRY(rs.getString("BILLTO_CNTRY"));
		obj.setSHIPTO_CUST_NAME(rs.getString("SHIPTO_CUST_NAME"));
		obj.setSHIPTO_ATTN_NAME(rs.getString("SHIPTO_ATTN_NAME"));
		obj.setSHIPTO_ADDR1(rs.getString("SHIPTO_ADDR1"));
		obj.setSHIPTO_ADDR2(rs.getString("SHIPTO_ADDR2"));
		obj.setSHIPTO_ADDR3(rs.getString("SHIPTO_ADDR3"));
		obj.setSHIPTO_CITY(rs.getString("SHIPTO_CITY"));
		obj.setSHIPTO_STATE(rs.getString("SHIPTO_STATE"));
		obj.setSHIPTO_POST_ZIP(rs.getString("SHIPTO_POST_ZIP"));
		obj.setSHIPTO_CNTRY(rs.getString("SHIPTO_CNTRY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
