package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DSR_INVOICE_LINE;

public class DSR_INVOICE_LINERowMapper<T> implements RowMapper<DSR_INVOICE_LINE> {

    private static final Logger log = Logger.getLogger(DSR_INVOICE_LINERowMapper.class);

	@Override
	public DSR_INVOICE_LINE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DSR_INVOICE_LINE obj = new DSR_INVOICE_LINE();
		
		obj.setINVOICE_LINE_CHANGE_AUDIT_KEY(rs.getBigDecimal("INVOICE_LINE_CHANGE_AUDIT_KEY"));
		obj.setCONFIRM_PURGE_FL(rs.getString("CONFIRM_PURGE_FL"));
		obj.setCREATE_DT(rs.getTimestamp("CREATE_DT"));
		obj.setUPDATE_DT(rs.getTimestamp("UPDATE_DT"));
		obj.setDELETE_DT(rs.getTimestamp("DELETE_DT"));
		obj.setUPDATE_ID(rs.getString("UPDATE_ID"));
		obj.setSYSTEM_ID(rs.getString("SYSTEM_ID"));
		obj.setICST_PO_ID(rs.getString("ICST_PO_ID"));
		obj.setWMS_CD(rs.getString("WMS_CD"));
		obj.setMFG_CD(rs.getString("MFG_CD"));
		obj.setPART_NBR(rs.getString("PART_NBR"));
		obj.setSCHED_DT(rs.getTimestamp("SCHED_DT"));
		obj.setORDER_QTY(rs.getBigDecimal("ORDER_QTY"));
		obj.setDW_REG_NBR(rs.getString("DW_REG_NBR"));
		obj.setLOI_FL(rs.getString("LOI_FL"));
		obj.setPOURSIT_ID(rs.getString("POURSIT_ID"));
		obj.setUSER_ID(rs.getString("USER_ID"));
		obj.setADD_CHG_FL(rs.getString("ADD_CHG_FL"));
		obj.setERROR1_CD(rs.getString("ERROR1_CD"));
		obj.setERROR2_CD(rs.getString("ERROR2_CD"));
		obj.setERROR3_CD(rs.getString("ERROR3_CD"));
		obj.setERROR4_CD(rs.getString("ERROR4_CD"));
		obj.setERROR5_CD(rs.getString("ERROR5_CD"));
		obj.setDW_REG_NO(rs.getString("DW_REG_NO"));
		obj.setINVOICE_NBR(rs.getString("INVOICE_NBR"));
		obj.setLAST_UPDATE_ACTION(rs.getString("LAST_UPDATE_ACTION"));
		obj.setAUDIT_LOG_KEY(rs.getBigDecimal("AUDIT_LOG_KEY"));
		obj.setSEG_RCVD_DT(rs.getTimestamp("SEG_RCVD_DT"));
		obj.setDIVISION_ID(rs.getString("DIVISION_ID"));
		obj.setINVOICE_COMPANY(rs.getString("INVOICE_COMPANY"));
		obj.setINVOICE_SEQ_NBR(rs.getString("INVOICE_SEQ_NBR"));
		obj.setMISC_CHARGE_AMT(rs.getBigDecimal("MISC_CHARGE_AMT"));
		obj.setWRHS_LOC_CD(rs.getString("WRHS_LOC_CD"));
		obj.setLINE_ITEM_NBR(rs.getString("LINE_ITEM_NBR"));
		obj.setLINE_ITEM_LAST_UPDATE_DT(rs.getTimestamp("LINE_ITEM_LAST_UPDATE_DT"));
		obj.setLINE_ITEM_SHIP_QTY(rs.getBigDecimal("LINE_ITEM_SHIP_QTY"));
		obj.setPART_CLASS_CD(rs.getString("PART_CLASS_CD"));
		obj.setCUST_REF_ID_1(rs.getString("CUST_REF_ID_1"));
		obj.setCUST_REF_ID_2(rs.getString("CUST_REF_ID_2"));
		obj.setCUST_PART_NBR(rs.getString("CUST_PART_NBR"));
		obj.setADJUSTED_COST_AMT(rs.getBigDecimal("ADJUSTED_COST_AMT"));
		obj.setAVG_POOL_COST_AMT(rs.getBigDecimal("AVG_POOL_COST_AMT"));
		obj.setORIG_COST_AMT(rs.getBigDecimal("ORIG_COST_AMT"));
		obj.setPROGRAM_CHARGE_AMT(rs.getBigDecimal("PROGRAM_CHARGE_AMT"));
		obj.setRESALE_PRICE_AMT(rs.getBigDecimal("RESALE_PRICE_AMT"));
		obj.setTARGET_COST_AMT(rs.getBigDecimal("TARGET_COST_AMT"));
		obj.setUNIT_COST_AMT(rs.getBigDecimal("UNIT_COST_AMT"));
		obj.setUS_RESALE_PRICE_AMT(rs.getBigDecimal("US_RESALE_PRICE_AMT"));
		obj.setCURRENCY_RATE_PCT(rs.getBigDecimal("CURRENCY_RATE_PCT"));
		obj.setDUTY_RATE_PCT(rs.getBigDecimal("DUTY_RATE_PCT"));
		obj.setREQUIRED_DT(rs.getTimestamp("REQUIRED_DT"));
		obj.setBACK_ORDER_QTY(rs.getBigDecimal("BACK_ORDER_QTY"));
		obj.setCUMULATIVE_PICK_QTY(rs.getBigDecimal("CUMULATIVE_PICK_QTY"));
		obj.setORIG_SHIPPER_QTY(rs.getBigDecimal("ORIG_SHIPPER_QTY"));
		obj.setREMAINING_DEMAND_QTY(rs.getBigDecimal("REMAINING_DEMAND_QTY"));
		obj.setSCHED_LATE_DEL_QTY(rs.getBigDecimal("SCHED_LATE_DEL_QTY"));
		obj.setSCHED_ON_TIME_DEL_QTY(rs.getBigDecimal("SCHED_ON_TIME_DEL_QTY"));
		obj.setSHIP_DE_QTY(rs.getBigDecimal("SHIP_DE_QTY"));
		obj.setTARGET_COST_QTY(rs.getBigDecimal("TARGET_COST_QTY"));
		obj.setDW_MATCH_CD(rs.getString("DW_MATCH_CD"));
		obj.setDW_SUPPORT_IND_ID(rs.getString("DW_SUPPORT_IND_ID"));
		obj.setLOI_AUTH_ID(rs.getString("LOI_AUTH_ID"));
		obj.setLOI_DEBIT_CREATE_FL(rs.getString("LOI_DEBIT_CREATE_FL"));
		obj.setLOI_EXPIRE_DT(rs.getTimestamp("LOI_EXPIRE_DT"));
		obj.setLOI_SUPPL_QUOTE_ID(rs.getString("LOI_SUPPL_QUOTE_ID"));
		obj.setASSIGNED_COST_CD(rs.getString("ASSIGNED_COST_CD"));
		obj.setCONDITION_CD(rs.getString("CONDITION_CD"));
		obj.setCURRENCY_TYPE_CD(rs.getString("CURRENCY_TYPE_CD"));
		obj.setINVOICE_TYPE_CD(rs.getString("INVOICE_TYPE_CD"));
		obj.setORDER_STATUS_MOVE_CD(rs.getString("ORDER_STATUS_MOVE_CD"));
		obj.setRETURN_REASON_CD(rs.getString("RETURN_REASON_CD"));
		obj.setEXPERT_SELLER_NBR(rs.getString("EXPERT_SELLER_NBR"));
		obj.setPO_LINE_ITEM_NBR(rs.getString("PO_LINE_ITEM_NBR"));
		obj.setSHOP_TICKET_NBR(rs.getString("SHOP_TICKET_NBR"));
		obj.setCUST_MFG_ID(rs.getString("CUST_MFG_ID"));
		obj.setQID_INSPECTOR_ID(rs.getString("QID_INSPECTOR_ID"));
		obj.setQID_PULLER_ID(rs.getString("QID_PULLER_ID"));
		obj.setQID_SHIP_ID(rs.getString("QID_SHIP_ID"));
		obj.setCOMPLETE_INTG_FL(rs.getString("COMPLETE_INTG_FL"));
		obj.setRED_COST_FL(rs.getString("RED_COST_FL"));
		obj.setMISC_CHARGE_DESC(rs.getString("MISC_CHARGE_DESC"));
		obj.setFIRST_CHG_ADD_COST_AMT(rs.getBigDecimal("FIRST_CHG_ADD_COST_AMT"));
		obj.setFIRST_CHG_ADD_AMT(rs.getBigDecimal("FIRST_CHG_ADD_AMT"));
		obj.setFIRST_CHG_ADD_REASON_CD(rs.getString("FIRST_CHG_ADD_REASON_CD"));
		obj.setSECOND_CHG_ADD_COST_AMT(rs.getBigDecimal("SECOND_CHG_ADD_COST_AMT"));
		obj.setSECOND_CHG_ADD_AMT(rs.getBigDecimal("SECOND_CHG_ADD_AMT"));
		obj.setSECOND_CHG_ADD_REASON_CD(rs.getString("SECOND_CHG_ADD_REASON_CD"));
		obj.setADD_COST_UNIT_AMT(rs.getBigDecimal("ADD_COST_UNIT_AMT"));
		obj.setADD_U_COST_REASON_CD(rs.getString("ADD_U_COST_REASON_CD"));
		obj.setUS_FIRST_CHG_ADD_AMT(rs.getBigDecimal("US_FIRST_CHG_ADD_AMT"));
		obj.setUS_SECOND_CHG_ADD_AMT(rs.getBigDecimal("US_SECOND_CHG_ADD_AMT"));
		obj.setFIRST_CHG_ADD_TAX_FL(rs.getString("FIRST_CHG_ADD_TAX_FL"));
		obj.setSECOND_CHG_ADD_TAX_FL(rs.getString("SECOND_CHG_ADD_TAX_FL"));
		obj.setMKT_COST_MULT(rs.getBigDecimal("MKT_COST_MULT"));
		obj.setMKT_UNIT_COST_AMT(rs.getBigDecimal("MKT_UNIT_COST_AMT"));
		obj.setMKT_ADJ_UNIT_COST_AMT(rs.getBigDecimal("MKT_ADJ_UNIT_COST_AMT"));
		obj.setMKT_ORIG_COST_AMT(rs.getBigDecimal("MKT_ORIG_COST_AMT"));
		obj.setORIG_CUST_HAZMAT_PREF_CD(rs.getString("ORIG_CUST_HAZMAT_PREF_CD"));
		obj.setORIG_LEAD_FREE_FL(rs.getString("ORIG_LEAD_FREE_FL"));
		obj.setORIG_ROHS_COMPLIANT_FL(rs.getString("ORIG_ROHS_COMPLIANT_FL"));
		obj.setORIG_GREEN_COMPLIANT_FL(rs.getString("ORIG_GREEN_COMPLIANT_FL"));
		obj.setMARKET_COST_OVERRIDE_FL(rs.getString("MARKET_COST_OVERRIDE_FL"));
		obj.setAFA_REPLENISH_CD(rs.getString("AFA_REPLENISH_CD"));
		obj.setSPEC_DRAWING_TX(rs.getString("SPEC_DRAWING_TX"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
