package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PPCPAYINST;

public class PPCPAYINSTRowMapper<T> implements RowMapper<PPCPAYINST> {

	@Override
	public PPCPAYINST mapRow(ResultSet rs, int rowNum) throws SQLException {
		PPCPAYINST obj = new PPCPAYINST();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setAMOUNT(rs.getBigDecimal("AMOUNT"));
		obj.setPPCPAYINST_ID(rs.getBigDecimal("PPCPAYINST_ID"));
		obj.setAPPROVINGAMOUNT(rs.getBigDecimal("APPROVINGAMOUNT"));
		obj.setAPPROVEDAMOUNT(rs.getBigDecimal("APPROVEDAMOUNT"));
		obj.setCREDITINGAMOUNT(rs.getBigDecimal("CREDITINGAMOUNT"));
		obj.setCREDITEDAMOUNT(rs.getBigDecimal("CREDITEDAMOUNT"));
		obj.setDEPOSITINGAMOUNT(rs.getBigDecimal("DEPOSITINGAMOUNT"));
		obj.setDEPOSITEDAMOUNT(rs.getBigDecimal("DEPOSITEDAMOUNT"));
		obj.setRVRSNGAPRVEDAMNT(rs.getBigDecimal("RVRSNGAPRVEDAMNT"));
		obj.setRVRSNGDPSTEDAMNT(rs.getBigDecimal("RVRSNGDPSTEDAMNT"));
		obj.setRVRSNGCRDTEDAMNT(rs.getBigDecimal("RVRSNGCRDTEDAMNT"));
		obj.setPAYMENTSYSTEMNAME(rs.getString("PAYMENTSYSTEMNAME"));
		obj.setACCOUNTNUMBER(rs.getString("ACCOUNTNUMBER"));
		obj.setPAYCONFIGID(rs.getString("PAYCONFIGID"));
		obj.setPLUGINNAME(rs.getString("PLUGINNAME"));
		obj.setORDER_ID(rs.getBigDecimal("ORDER_ID"));
		obj.setRMA_ID(rs.getBigDecimal("RMA_ID"));
		
		return obj;
	}

}
