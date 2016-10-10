package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DSR_SALES_ORDER;

public class DSR_SALES_ORDERRowMapper<T> implements RowMapper<DSR_SALES_ORDER> {

	@Override
	public DSR_SALES_ORDER mapRow(ResultSet rs, int rowNum) throws SQLException {
		DSR_SALES_ORDER obj = new DSR_SALES_ORDER();
		
		obj.setSALES_ORDER_COMPANY(rs.getString("SALES_ORDER_COMPANY"));
		obj.setSCN_SEQ_NBR(rs.getString("SCN_SEQ_NBR"));
		obj.setORDER_TYPE_CD(rs.getString("ORDER_TYPE_CD"));
		obj.setGOVT_CONTRACT_ID(rs.getString("GOVT_CONTRACT_ID"));
		obj.setAUTHORIZER_NAME(rs.getString("AUTHORIZER_NAME"));
		obj.setSO_LINE_ITEM_CNT(rs.getBigDecimal("SO_LINE_ITEM_CNT"));
		obj.setFORECAST_ID(rs.getString("FORECAST_ID"));
		obj.setPURGE_ORDER_FL(rs.getString("PURGE_ORDER_FL"));
		obj.setLAST_UPDATE_ID(rs.getString("LAST_UPDATE_ID"));
		obj.setBUYER_AREA_CODE_NBR(rs.getString("BUYER_AREA_CODE_NBR"));
		obj.setBUYER_PHONE_NBR(rs.getString("BUYER_PHONE_NBR"));
		obj.setBUYER_PHONE_EXT_NBR(rs.getString("BUYER_PHONE_EXT_NBR"));
		obj.setSPEC_DRAWING_TXT(rs.getString("SPEC_DRAWING_TXT"));
		obj.setSPCL_INST_TXT(rs.getString("SPCL_INST_TXT"));
		obj.setINTERNAL_INST_TXT(rs.getString("INTERNAL_INST_TXT"));
		obj.setCOMMENT_TXT(rs.getString("COMMENT_TXT"));
		obj.setSLSMN_INSIDE_ID(rs.getString("SLSMN_INSIDE_ID"));
		obj.setPRIORITY_CD(rs.getString("PRIORITY_CD"));
		obj.setFRT_CHARGE_CD(rs.getString("FRT_CHARGE_CD"));
		obj.setTOTAL_VALUE_AMT(rs.getBigDecimal("TOTAL_VALUE_AMT"));
		obj.setSHIP_COMPLETE_CD(rs.getString("SHIP_COMPLETE_CD"));
		obj.setOVERRIDE_CUST_FL(rs.getString("OVERRIDE_CUST_FL"));
		obj.setDW_ORDER_TYPE_CD(rs.getString("DW_ORDER_TYPE_CD"));
		obj.setORIG_CARRIER_CD(rs.getString("ORIG_CARRIER_CD"));
		obj.setCARRIER_BAL_CD(rs.getString("CARRIER_BAL_CD"));
		obj.setCARRIER_ACCT_ID(rs.getString("CARRIER_ACCT_ID"));
		obj.setAUTH_TERMS_CD(rs.getString("AUTH_TERMS_CD"));
		obj.setAUTH_TERMS_ID(rs.getString("AUTH_TERMS_ID"));
		obj.setAUTH_TRADE_TERMS_CD(rs.getString("AUTH_TRADE_TERMS_CD"));
		obj.setAUTH_TRADE_TERMS_ID(rs.getString("AUTH_TRADE_TERMS_ID"));
		obj.setCREDIT_HOLD_FL(rs.getString("CREDIT_HOLD_FL"));
		obj.setCREDIT_CAT_CD(rs.getString("CREDIT_CAT_CD"));
		obj.setWEB_ORDER_DIVISION(rs.getString("WEB_ORDER_DIVISION"));
		obj.setWEB_ORDER_NBR(rs.getBigDecimal("WEB_ORDER_NBR"));
		obj.setWEB_USER_DIVISION(rs.getString("WEB_USER_DIVISION"));
		obj.setWEB_USER_NBR(rs.getString("WEB_USER_NBR"));
		obj.setWEB_FREIGHT_AMT(rs.getBigDecimal("WEB_FREIGHT_AMT"));
		obj.setWEB_HANDLING_AMT(rs.getBigDecimal("WEB_HANDLING_AMT"));
		obj.setWEB_EMAIL_ADDR_TXT(rs.getString("WEB_EMAIL_ADDR_TXT"));
		obj.setRENEGOTIATE_FL(rs.getString("RENEGOTIATE_FL"));
		obj.setHOT_SHIP_FL(rs.getString("HOT_SHIP_FL"));
		obj.setB2B_IDENTIFIER_CD(rs.getString("B2B_IDENTIFIER_CD"));
		obj.setMISC_EMAIL_FL(rs.getString("MISC_EMAIL_FL"));
		obj.setLAST_ACCESSED_DT_TXT(rs.getString("LAST_ACCESSED_DT_TXT"));
		obj.setLAST_ACCESSED_TM_TXT(rs.getString("LAST_ACCESSED_TM_TXT"));
		obj.setDATE_STAMP_NBR(rs.getBigDecimal("DATE_STAMP_NBR"));
		obj.setTIME_STAMP_NBR(rs.getBigDecimal("TIME_STAMP_NBR"));
		obj.setORDER_CHANGE_AUDIT_KEY(rs.getBigDecimal("ORDER_CHANGE_AUDIT_KEY"));
		obj.setSHC_CNTL_CD(rs.getString("SHC_CNTL_CD"));
		obj.setWEB_USER_ID(rs.getString("WEB_USER_ID"));
		obj.setCONTRACT_START_DT(rs.getTimestamp("CONTRACT_START_DT"));
		obj.setCONTRACT_END_DT(rs.getTimestamp("CONTRACT_END_DT"));
		obj.setINVOICE_OK_FL(rs.getString("INVOICE_OK_FL"));
		obj.setENTITLEMENT_FL(rs.getString("ENTITLEMENT_FL"));
		obj.setBILLING_FREQUENCY_TX(rs.getString("BILLING_FREQUENCY_TX"));
		obj.setSERVICE_CONTRACT_ID(rs.getString("SERVICE_CONTRACT_ID"));
		obj.setORDER_CUST_PO_AL_KEY(rs.getBigDecimal("ORDER_CUST_PO_AL_KEY"));
		obj.setRESERVATION_ORDER_CD(rs.getString("RESERVATION_ORDER_CD"));
		obj.setCREATE_DT(rs.getTimestamp("CREATE_DT"));
		obj.setUPDATE_DT(rs.getTimestamp("UPDATE_DT"));
		obj.setLAST_UPDATE_ACTION(rs.getString("LAST_UPDATE_ACTION"));
		obj.setAUDIT_LOG_KEY(rs.getBigDecimal("AUDIT_LOG_KEY"));
		obj.setSEG_RCVD_DT(rs.getTimestamp("SEG_RCVD_DT"));
		obj.setDIVISION_ID(rs.getString("DIVISION_ID"));
		obj.setSHIPTO_CUST_NBR(rs.getString("SHIPTO_CUST_NBR"));
		obj.setSHIP_FIRST_FL(rs.getString("SHIP_FIRST_FL"));
		obj.setDELETE_DT(rs.getTimestamp("DELETE_DT"));
		obj.setUPDATE_ID(rs.getString("UPDATE_ID"));
		obj.setSYSTEM_ID(rs.getString("SYSTEM_ID"));
		obj.setSCN(rs.getString("SCN"));
		obj.setRELEASE_ID(rs.getString("RELEASE_ID"));
		obj.setFOB_CD(rs.getString("FOB_CD"));
		obj.setORDER_DT(rs.getTimestamp("ORDER_DT"));
		obj.setCUST_ST_NO(rs.getString("CUST_ST_NO"));
		obj.setCUST_PO_ID(rs.getString("CUST_PO_ID"));
		obj.setCLOSE_DT(rs.getTimestamp("CLOSE_DT"));
		obj.setSTATUS_CD(rs.getString("STATUS_CD"));
		obj.setREASON_CD(rs.getString("REASON_CD"));
		obj.setBUYER_NAME(rs.getString("BUYER_NAME"));
		obj.setSPEC_TXT(rs.getString("SPEC_TXT"));
		obj.setPLN_FL(rs.getString("PLN_FL"));
		obj.setFDS_PO_CNT(rs.getBigDecimal("FDS_PO_CNT"));
		obj.setAPO_QT(rs.getBigDecimal("APO_QT"));
		obj.setCUST_TAX_TYPE_CD(rs.getString("CUST_TAX_TYPE_CD"));
		obj.setPAY_METHOD_CD(rs.getString("PAY_METHOD_CD"));
		obj.setPAY_TERMS_CD(rs.getString("PAY_TERMS_CD"));
		obj.setTRADE_TERMS_CD(rs.getString("TRADE_TERMS_CD"));
		obj.setBILLTO_CUST_NBR(rs.getString("BILLTO_CUST_NBR"));
		obj.setCOMPANY_ST_NO(rs.getString("COMPANY_ST_NO"));
		obj.setCUST_ACCT_ST_NO(rs.getString("CUST_ACCT_ST_NO"));
		obj.setCUST_LOC_ST_NO(rs.getString("CUST_LOC_ST_NO"));
		obj.setFLAT_FREIGHT_AM(rs.getBigDecimal("FLAT_FREIGHT_AM"));
		obj.setFLAT_FRT_CD(rs.getString("FLAT_FRT_CD"));
		
		return obj;
	}

}
