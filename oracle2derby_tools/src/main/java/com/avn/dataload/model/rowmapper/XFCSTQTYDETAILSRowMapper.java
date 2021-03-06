package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFCSTQTYDETAILS;

public class XFCSTQTYDETAILSRowMapper<T> implements RowMapper<XFCSTQTYDETAILS> {

    private static final Logger log = Logger.getLogger(XFCSTQTYDETAILSRowMapper.class);

	@Override
	public XFCSTQTYDETAILS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFCSTQTYDETAILS obj = new XFCSTQTYDETAILS();
		
		obj.setMATERIAL_NBR(rs.getString("MATERIAL_NBR"));
		obj.setCOVERED_FLAG(rs.getBigDecimal("COVERED_FLAG"));
		obj.setCONSTRAINED_FLAG(rs.getBigDecimal("CONSTRAINED_FLAG"));
		obj.setNO_FCST_QTY_FLAG(rs.getBigDecimal("NO_FCST_QTY_FLAG"));
		obj.setFORECAST_RCV_DATE(rs.getTimestamp("FORECAST_RCV_DATE"));
		obj.setCONSIGN_INV(rs.getBigDecimal("CONSIGN_INV"));
		obj.setFCST_AMENDED(rs.getBigDecimal("FCST_AMENDED"));
		obj.setAVNET_COMMIT(rs.getBigDecimal("AVNET_COMMIT"));
		obj.setCUST_TOT_NEED(rs.getBigDecimal("CUST_TOT_NEED"));
		obj.setINTERMEDIATE_CALC_VALUE(rs.getBigDecimal("INTERMEDIATE_CALC_VALUE"));
		obj.setEXCESS_SHORTAGE(rs.getBigDecimal("EXCESS_SHORTAGE"));
		obj.setRUNNING_TOTAL(rs.getBigDecimal("RUNNING_TOTAL"));
		obj.setINV_POSITION(rs.getBigDecimal("INV_POSITION"));
		obj.setZKB1_ORDERS(rs.getBigDecimal("ZKB1_ORDERS"));
		obj.setZKA1_ORDERS(rs.getBigDecimal("ZKA1_ORDERS"));
		obj.setZKE1_ORDERS(rs.getBigDecimal("ZKE1_ORDERS"));
		obj.setFCST_PARTY(rs.getString("FCST_PARTY"));
		obj.setCUST_MAT(rs.getString("CUST_MAT"));
		obj.setUPDATED_ON(rs.getTimestamp("UPDATED_ON"));
		obj.setWEEK_NBR(rs.getBigDecimal("WEEK_NBR"));
		obj.setFCST_RAW(rs.getBigDecimal("FCST_RAW"));
		obj.setZSB_ORDERS(rs.getBigDecimal("ZSB_ORDERS"));
		obj.setZFC_ORDERS(rs.getBigDecimal("ZFC_ORDERS"));
		obj.setCAL_W_INV(rs.getBigDecimal("CAL_W_INV"));
		obj.setAVL_FAC_PO(rs.getBigDecimal("AVL_FAC_PO"));
		obj.setPLANT_INV(rs.getBigDecimal("PLANT_INV"));
		obj.setZOR_ORDERS(rs.getBigDecimal("ZOR_ORDERS"));
		obj.setFORECAST_ID(rs.getBigDecimal("FORECAST_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
