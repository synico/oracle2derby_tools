package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DSR_INVOICE;

public class DSR_INVOICERowMapper<T> implements RowMapper<DSR_INVOICE> {

    private static final Logger log = Logger.getLogger(DSR_INVOICERowMapper.class);

	@Override
	public DSR_INVOICE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DSR_INVOICE obj = new DSR_INVOICE();
		
		obj.setPAY_TERMS_CD(rs.getString("PAY_TERMS_CD"));
		obj.setTRADE_TERMS_CD(rs.getString("TRADE_TERMS_CD"));
		obj.setLOCAL_TAX_PCT(rs.getBigDecimal("LOCAL_TAX_PCT"));
		obj.setSTATE_TAX_PCT(rs.getBigDecimal("STATE_TAX_PCT"));
		obj.setTAX_CREDIT_FL(rs.getString("TAX_CREDIT_FL"));
		obj.setICST_TYPE_CD(rs.getString("ICST_TYPE_CD"));
		obj.setSTATUS_CUTBACK_CNT(rs.getBigDecimal("STATUS_CUTBACK_CNT"));
		obj.setSTATUS_INSP_CNT(rs.getBigDecimal("STATUS_INSP_CNT"));
		obj.setSTATUS_INSP_DBL_CNT(rs.getBigDecimal("STATUS_INSP_DBL_CNT"));
		obj.setSTATUS_INSP_TDSK_CNT(rs.getBigDecimal("STATUS_INSP_TDSK_CNT"));
		obj.setSTATUS_LARGE_ORDER_CNT(rs.getBigDecimal("STATUS_LARGE_ORDER_CNT"));
		obj.setSTATUS_PACK_CNT(rs.getBigDecimal("STATUS_PACK_CNT"));
		obj.setSTATUS_PACK_DE_CNT(rs.getBigDecimal("STATUS_PACK_DE_CNT"));
		obj.setSTATUS_PRODUCTION_CNT(rs.getBigDecimal("STATUS_PRODUCTION_CNT"));
		obj.setSTATUS_WRHS_TDSK_CNT(rs.getBigDecimal("STATUS_WRHS_TDSK_CNT"));
		obj.setTAX_RATE_GEO_STATE_CD(rs.getString("TAX_RATE_GEO_STATE_CD"));
		obj.setTAX_RATE_GEO_COUNTY_CD(rs.getString("TAX_RATE_GEO_COUNTY_CD"));
		obj.setTAX_RATE_GEO_CITY_CD(rs.getString("TAX_RATE_GEO_CITY_CD"));
		obj.setQID_INSPECTOR1_CD(rs.getString("QID_INSPECTOR1_CD"));
		obj.setQID_INSPECTOR2_CD(rs.getString("QID_INSPECTOR2_CD"));
		obj.setQID_INSPECTOR3_CD(rs.getString("QID_INSPECTOR3_CD"));
		obj.setQID_LAST_UPDATE(rs.getString("QID_LAST_UPDATE"));
		obj.setASRS_LAST_PRINT(rs.getString("ASRS_LAST_PRINT"));
		obj.setCOMPLETE_2006_FL(rs.getString("COMPLETE_2006_FL"));
		obj.setCOMPLETE_RELEASE_FL(rs.getString("COMPLETE_RELEASE_FL"));
		obj.setCONFIRM_PURGE_FL(rs.getString("CONFIRM_PURGE_FL"));
		obj.setMAG_PRINT_ID(rs.getString("MAG_PRINT_ID"));
		obj.setSEGMENT_CREATE_CD(rs.getString("SEGMENT_CREATE_CD"));
		obj.setINVOICE_CHANGE_AUDIT_KEY(rs.getBigDecimal("INVOICE_CHANGE_AUDIT_KEY"));
		obj.setBILLTO_CUST_NBR(rs.getString("BILLTO_CUST_NBR"));
		obj.setCOMPANY_ST_NO(rs.getString("COMPANY_ST_NO"));
		obj.setCUST_ACCT_ST_NO(rs.getString("CUST_ACCT_ST_NO"));
		obj.setCUST_LOC_ST_NO(rs.getString("CUST_LOC_ST_NO"));
		obj.setFLAT_FREIGHT_AM(rs.getBigDecimal("FLAT_FREIGHT_AM"));
		obj.setFLAT_FRT_CD(rs.getString("FLAT_FRT_CD"));
		obj.setIVC_ORIGINAL_NO(rs.getString("IVC_ORIGINAL_NO"));
		obj.setFRT_INSUR_AM(rs.getBigDecimal("FRT_INSUR_AM"));
		obj.setFRT_CUST_PARTIAL_AM(rs.getBigDecimal("FRT_CUST_PARTIAL_AM"));
		obj.setSTD_HANDLING_AM(rs.getBigDecimal("STD_HANDLING_AM"));
		obj.setSPLIT_PREV_INVOICE_NBR(rs.getString("SPLIT_PREV_INVOICE_NBR"));
		obj.setSPLIT_INVOICE_CD(rs.getString("SPLIT_INVOICE_CD"));
		obj.setAUDIT_LOG_DT(rs.getTimestamp("AUDIT_LOG_DT"));
		obj.setCREATE_DT(rs.getTimestamp("CREATE_DT"));
		obj.setUPDATE_DT(rs.getTimestamp("UPDATE_DT"));
		obj.setDELETE_DT(rs.getTimestamp("DELETE_DT"));
		obj.setUPDATE_ID(rs.getString("UPDATE_ID"));
		obj.setSYSTEM_ID(rs.getString("SYSTEM_ID"));
		obj.setSCN(rs.getString("SCN"));
		obj.setRELEASE_ID(rs.getString("RELEASE_ID"));
		obj.setSLSMN_CSM(rs.getString("SLSMN_CSM"));
		obj.setSLSMN_ASM(rs.getString("SLSMN_ASM"));
		obj.setSLSMN_CSR(rs.getString("SLSMN_CSR"));
		obj.setSLSMN_PSS(rs.getString("SLSMN_PSS"));
		obj.setSLSMN_TAE(rs.getString("SLSMN_TAE"));
		obj.setCOD_AMT(rs.getBigDecimal("COD_AMT"));
		obj.setFOB_CD(rs.getString("FOB_CD"));
		obj.setMAIL_FL(rs.getString("MAIL_FL"));
		obj.setWEIGHT_LBS(rs.getBigDecimal("WEIGHT_LBS"));
		obj.setORDER_DT(rs.getTimestamp("ORDER_DT"));
		obj.setSHIP_DT(rs.getTimestamp("SHIP_DT"));
		obj.setWAYBILL_ID(rs.getString("WAYBILL_ID"));
		obj.setICST_PO_ID(rs.getString("ICST_PO_ID"));
		obj.setPROM_FL(rs.getString("PROM_FL"));
		obj.setWMS_CD(rs.getString("WMS_CD"));
		obj.setCUST_ST_NO(rs.getString("CUST_ST_NO"));
		obj.setEMAIL_FL(rs.getString("EMAIL_FL"));
		obj.setINVOICE_NBR(rs.getString("INVOICE_NBR"));
		obj.setLAST_UPDATE_ACTION(rs.getString("LAST_UPDATE_ACTION"));
		obj.setAUDIT_LOG_KEY(rs.getBigDecimal("AUDIT_LOG_KEY"));
		obj.setSEG_RCVD_DT(rs.getTimestamp("SEG_RCVD_DT"));
		obj.setDIVISION_ID(rs.getString("DIVISION_ID"));
		obj.setINVOICE_COMPANY(rs.getString("INVOICE_COMPANY"));
		obj.setINVOICE_SEQ_NBR(rs.getString("INVOICE_SEQ_NBR"));
		obj.setINV_LINE_ITEM_CNT(rs.getBigDecimal("INV_LINE_ITEM_CNT"));
		obj.setSHIPTO_CUST_NBR(rs.getString("SHIPTO_CUST_NBR"));
		obj.setCUST_INVOICE_NBR(rs.getBigDecimal("CUST_INVOICE_NBR"));
		obj.setCUSTOMER_PO_NBR(rs.getString("CUSTOMER_PO_NBR"));
		obj.setINVOICE_AMT(rs.getBigDecimal("INVOICE_AMT"));
		obj.setINVOICE_TAX_AMT(rs.getBigDecimal("INVOICE_TAX_AMT"));
		obj.setMISC_CHARGE_AMT(rs.getBigDecimal("MISC_CHARGE_AMT"));
		obj.setPART_TOTAL_AMT(rs.getBigDecimal("PART_TOTAL_AMT"));
		obj.setRESTOCK_CHARGE_AMT(rs.getBigDecimal("RESTOCK_CHARGE_AMT"));
		obj.setCOMMISSION_PCT(rs.getBigDecimal("COMMISSION_PCT"));
		obj.setINSIDE_SLSMN_ID(rs.getString("INSIDE_SLSMN_ID"));
		obj.setSLSMN_FIELD(rs.getString("SLSMN_FIELD"));
		obj.setSLSMN_MISC1(rs.getString("SLSMN_MISC1"));
		obj.setSLSMN_MISC2(rs.getString("SLSMN_MISC2"));
		obj.setSLSMN_MISC3(rs.getString("SLSMN_MISC3"));
		obj.setSLSMN_MISC4(rs.getString("SLSMN_MISC4"));
		obj.setSLSMN_MISC5(rs.getString("SLSMN_MISC5"));
		obj.setSLSMN_MISC6(rs.getString("SLSMN_MISC6"));
		obj.setSLSMN_MISC7(rs.getString("SLSMN_MISC7"));
		obj.setSLSMN_MISC8(rs.getString("SLSMN_MISC8"));
		obj.setSLSMN_MISC9(rs.getString("SLSMN_MISC9"));
		obj.setACTUAL_CARRIER_CD(rs.getString("ACTUAL_CARRIER_CD"));
		obj.setCARRIER_OVERRIDE_TXT(rs.getString("CARRIER_OVERRIDE_TXT"));
		obj.setCARRIER_OVRRD_RSN_CD(rs.getString("CARRIER_OVRRD_RSN_CD"));
		obj.setFREIGHT_AMT(rs.getBigDecimal("FREIGHT_AMT"));
		obj.setFREIGHT_CHARGE_CD(rs.getString("FREIGHT_CHARGE_CD"));
		obj.setFREIGHT_PROCESSED_FL(rs.getString("FREIGHT_PROCESSED_FL"));
		obj.setPACKAGE_QTY(rs.getBigDecimal("PACKAGE_QTY"));
		obj.setQID_PACKER_CD(rs.getString("QID_PACKER_CD"));
		obj.setSHIP_VIA_CD(rs.getString("SHIP_VIA_CD"));
		obj.setSHIP_VIA_OVERRIDE_CD(rs.getString("SHIP_VIA_OVERRIDE_CD"));
		obj.setSHIP_VIA_OVRRD_RSN_CD(rs.getString("SHIP_VIA_OVRRD_RSN_CD"));
		obj.setSHIP_VIA_OVRRD_RSN_TXT(rs.getString("SHIP_VIA_OVRRD_RSN_TXT"));
		obj.setFACILITY_STATUS_DS(rs.getString("FACILITY_STATUS_DS"));
		obj.setINVENTORY_LOC_CD(rs.getString("INVENTORY_LOC_CD"));
		obj.setSHIP_FIRST_FL(rs.getString("SHIP_FIRST_FL"));
		obj.setSHIPPER_CREATE_DT(rs.getTimestamp("SHIPPER_CREATE_DT"));
		obj.setWRHS_LOC_CD(rs.getString("WRHS_LOC_CD"));
		obj.setCREDIT_DEBIT_CD(rs.getString("CREDIT_DEBIT_CD"));
		obj.setCUST_TAX_TYPE_CD(rs.getString("CUST_TAX_TYPE_CD"));
		obj.setPAY_METHOD_CD(rs.getString("PAY_METHOD_CD"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
