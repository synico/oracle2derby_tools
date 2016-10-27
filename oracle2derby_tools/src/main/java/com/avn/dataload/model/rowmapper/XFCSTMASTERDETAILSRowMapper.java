package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XFCSTMASTERDETAILS;

public class XFCSTMASTERDETAILSRowMapper<T> implements RowMapper<XFCSTMASTERDETAILS> {

    private static final Logger log = Logger.getLogger(XFCSTMASTERDETAILSRowMapper.class);

	@Override
	public XFCSTMASTERDETAILS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFCSTMASTERDETAILS obj = new XFCSTMASTERDETAILS();
		
		obj.setMATERIAL_NBR(rs.getString("MATERIAL_NBR"));
		obj.setMFR_PART_NBR(rs.getString("MFR_PART_NBR"));
		obj.setNET_OF_BACKLOG(rs.getString("NET_OF_BACKLOG"));
		obj.setCONSIGNMENT(rs.getString("CONSIGNMENT"));
		obj.setCONSIGNMENT_FLAG(rs.getString("CONSIGNMENT_FLAG"));
		obj.setCOVERED_FLAG(rs.getBigDecimal("COVERED_FLAG"));
		obj.setCONSTRAINED_FLAG(rs.getBigDecimal("CONSTRAINED_FLAG"));
		obj.setNO_FCST_QTY_FLAG(rs.getBigDecimal("NO_FCST_QTY_FLAG"));
		obj.setFORECAST_RCV_DATE(rs.getTimestamp("FORECAST_RCV_DATE"));
		obj.setPLANT_INVENTORY(rs.getBigDecimal("PLANT_INVENTORY"));
		obj.setCONSIGN_INV(rs.getBigDecimal("CONSIGN_INV"));
		obj.setFCST_PARTY(rs.getString("FCST_PARTY"));
		obj.setCUST_MAT(rs.getString("CUST_MAT"));
		obj.setMFR(rs.getString("MFR"));
		obj.setFCST_FREQ(rs.getString("FCST_FREQ"));
		obj.setNET_OF_QOH(rs.getString("NET_OF_QOH"));
		obj.setRESERVING(rs.getString("RESERVING"));
		obj.setW_INV(rs.getString("W_INV"));
		obj.setINVENTORY(rs.getBigDecimal("INVENTORY"));
		obj.setLEAD_TIME(rs.getBigDecimal("LEAD_TIME"));
		obj.setUPDATED_ON(rs.getTimestamp("UPDATED_ON"));
		obj.setVMI(rs.getString("VMI"));
		obj.setWERKS(rs.getString("WERKS"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setFORECAST_ID(rs.getBigDecimal("FORECAST_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
