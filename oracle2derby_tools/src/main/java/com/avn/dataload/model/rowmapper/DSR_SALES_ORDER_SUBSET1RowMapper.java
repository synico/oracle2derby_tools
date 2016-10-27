package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DSR_SALES_ORDER_SUBSET1;

public class DSR_SALES_ORDER_SUBSET1RowMapper<T> implements RowMapper<DSR_SALES_ORDER_SUBSET1> {

    private static final Logger log = Logger.getLogger(DSR_SALES_ORDER_SUBSET1RowMapper.class);

	@Override
	public DSR_SALES_ORDER_SUBSET1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		DSR_SALES_ORDER_SUBSET1 obj = new DSR_SALES_ORDER_SUBSET1();
		
		obj.setCUST_PO_ID(rs.getString("CUST_PO_ID"));
		obj.setSTATUS_CD(rs.getString("STATUS_CD"));
		obj.setBUYER_NAME(rs.getString("BUYER_NAME"));
		obj.setSTATUS_TX(rs.getString("STATUS_TX"));
		obj.setCREATE_DT(rs.getTimestamp("CREATE_DT"));
		obj.setUPDATE_DT(rs.getTimestamp("UPDATE_DT"));
		obj.setSCN(rs.getString("SCN"));
		obj.setRELEASE_ID(rs.getString("RELEASE_ID"));
		obj.setORDER_DT(rs.getTimestamp("ORDER_DT"));
		obj.setMFG_CD(rs.getString("MFG_CD"));
		obj.setPART_NBR(rs.getString("PART_NBR"));
		obj.setLAST_UPDATE_ACTION(rs.getString("LAST_UPDATE_ACTION"));
		obj.setSHIPTO_CUST_NBR(rs.getString("SHIPTO_CUST_NBR"));
		obj.setLINE_ITEM_NBR(rs.getString("LINE_ITEM_NBR"));
		obj.setCUST_PART_NBR(rs.getString("CUST_PART_NBR"));
		obj.setCONDITION_CD(rs.getString("CONDITION_CD"));
		obj.setREQD_DELV_DT(rs.getTimestamp("REQD_DELV_DT"));
		obj.setSHIPPER_PROG_NBR(rs.getString("SHIPPER_PROG_NBR"));
		obj.setSUPPLIER_ID(rs.getString("SUPPLIER_ID"));
		obj.setSUPPLIER_PART_NBR(rs.getString("SUPPLIER_PART_NBR"));
		obj.setSUPPLIER_SHORT_NM(rs.getString("SUPPLIER_SHORT_NM"));
		obj.setAVNET_ERP_NM(rs.getString("AVNET_ERP_NM"));
		obj.setPROMISED_DELV_DT(rs.getTimestamp("PROMISED_DELV_DT"));
		obj.setWCS_ORDER_ID(rs.getString("WCS_ORDER_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
