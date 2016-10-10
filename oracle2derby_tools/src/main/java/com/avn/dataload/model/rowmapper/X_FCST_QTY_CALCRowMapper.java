package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_FCST_QTY_CALC;

public class X_FCST_QTY_CALCRowMapper<T> implements RowMapper<X_FCST_QTY_CALC> {

	@Override
	public X_FCST_QTY_CALC mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_FCST_QTY_CALC obj = new X_FCST_QTY_CALC();
		
		obj.setFORECAST_ID(rs.getBigDecimal("FORECAST_ID"));
		obj.setFCST_PARTY(rs.getString("FCST_PARTY"));
		obj.setCUST_MAT(rs.getString("CUST_MAT"));
		obj.setRESERVING(rs.getString("RESERVING"));
		obj.setW_INV(rs.getString("W_INV"));
		obj.setINVENTORY(rs.getBigDecimal("INVENTORY"));
		obj.setLEAD_TIME(rs.getBigDecimal("LEAD_TIME"));
		obj.setUPDATED_ON(rs.getTimestamp("UPDATED_ON"));
		obj.setVMI(rs.getString("VMI"));
		obj.setWEEK_NBR(rs.getBigDecimal("WEEK_NBR"));
		obj.setFCST_RAW(rs.getBigDecimal("FCST_RAW"));
		obj.setZSB_ORDERS(rs.getBigDecimal("ZSB_ORDERS"));
		obj.setZFC_ORDERS(rs.getBigDecimal("ZFC_ORDERS"));
		obj.setCAL_W_INV(rs.getBigDecimal("CAL_W_INV"));
		obj.setAVL_FAC_PO(rs.getBigDecimal("AVL_FAC_PO"));
		obj.setZOR_ORDERS(rs.getBigDecimal("ZOR_ORDERS"));
		obj.setMATERIAL_NBR(rs.getString("MATERIAL_NBR"));
		obj.setNET_OF_BACKLOG(rs.getString("NET_OF_BACKLOG"));
		obj.setCONSIGNMENT(rs.getString("CONSIGNMENT"));
		obj.setCOVERED_FLAG(rs.getBigDecimal("COVERED_FLAG"));
		obj.setCONSTRAINED_FLAG(rs.getBigDecimal("CONSTRAINED_FLAG"));
		obj.setNO_FCST_QTY_FLAG(rs.getBigDecimal("NO_FCST_QTY_FLAG"));
		obj.setFORECAST_RCV_DATE(rs.getTimestamp("FORECAST_RCV_DATE"));
		obj.setPLANT_INVENTORY(rs.getBigDecimal("PLANT_INVENTORY"));
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
		
		return obj;
	}

}
