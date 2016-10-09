package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DsrInvoiceLine;

public class DsrInvoiceLineRowMapper<T> implements RowMapper<DsrInvoiceLine> {

	@Override
	public DsrInvoiceLine mapRow(ResultSet rs, int rowNum) throws SQLException {
		DsrInvoiceLine obj = new DsrInvoiceLine();
		
		obj.setLastUpdateAction(rs.getString("LAST_UPDATE_ACTION"));
		obj.setAuditLogKey(rs.getLong("AUDIT_LOG_KEY"));
		obj.setInvoiceCompany(rs.getString("INVOICE_COMPANY"));
		obj.setInvoiceSeqNbr(rs.getString("INVOICE_SEQ_NBR"));
		obj.setMiscChargeAmt(rs.getBigDecimal("MISC_CHARGE_AMT"));
		obj.setCreateDt(rs.getDate("CREATE_DT"));
		obj.setUpdateDt(rs.getDate("UPDATE_DT"));
		obj.setDeleteDt(rs.getDate("DELETE_DT"));
		obj.setUpdateId(rs.getString("UPDATE_ID"));
		obj.setSystemId(rs.getString("SYSTEM_ID"));
		obj.setSegRcvdDt(rs.getDate("SEG_RCVD_DT"));
		obj.setDivisionId(rs.getString("DIVISION_ID"));
		obj.setLineItemLastUpdateDt(rs.getDate("LINE_ITEM_LAST_UPDATE_DT"));
		obj.setLineItemShipQty(rs.getInteger("LINE_ITEM_SHIP_QTY"));
		obj.setPartClassCd(rs.getString("PART_CLASS_CD"));
		obj.setCustPartNbr(rs.getString("CUST_PART_NBR"));
		obj.setAdjustedCostAmt(rs.getBigDecimal("ADJUSTED_COST_AMT"));
		obj.setAvgPoolCostAmt(rs.getBigDecimal("AVG_POOL_COST_AMT"));
		obj.setOrigCostAmt(rs.getBigDecimal("ORIG_COST_AMT"));
		obj.setProgramChargeAmt(rs.getBigDecimal("PROGRAM_CHARGE_AMT"));
		obj.setResalePriceAmt(rs.getBigDecimal("RESALE_PRICE_AMT"));
		obj.setTargetCostAmt(rs.getBigDecimal("TARGET_COST_AMT"));
		obj.setUnitCostAmt(rs.getBigDecimal("UNIT_COST_AMT"));
		obj.setUsResalePriceAmt(rs.getBigDecimal("US_RESALE_PRICE_AMT"));
		obj.setCurrencyRatePct(rs.getBigDecimal("CURRENCY_RATE_PCT"));
		obj.setDutyRatePct(rs.getBigDecimal("DUTY_RATE_PCT"));
		obj.setBackOrderQty(rs.getInteger("BACK_ORDER_QTY"));
		obj.setCumulativePickQty(rs.getInteger("CUMULATIVE_PICK_QTY"));
		obj.setOrigShipperQty(rs.getInteger("ORIG_SHIPPER_QTY"));
		obj.setRemainingDemandQty(rs.getInteger("REMAINING_DEMAND_QTY"));
		obj.setSchedLateDelQty(rs.getShort("SCHED_LATE_DEL_QTY"));
		obj.setSchedOnTimeDelQty(rs.getShort("SCHED_ON_TIME_DEL_QTY"));
		obj.setTargetCostQty(rs.getInteger("TARGET_COST_QTY"));
		obj.setDwSupportIndId(rs.getString("DW_SUPPORT_IND_ID"));
		obj.setLoiDebitCreateFl(rs.getString("LOI_DEBIT_CREATE_FL"));
		obj.setLoiExpireDt(rs.getDate("LOI_EXPIRE_DT"));
		obj.setLoiSupplQuoteId(rs.getString("LOI_SUPPL_QUOTE_ID"));
		obj.setAssignedCostCd(rs.getString("ASSIGNED_COST_CD"));
		obj.setConditionCd(rs.getString("CONDITION_CD"));
		obj.setCurrencyTypeCd(rs.getString("CURRENCY_TYPE_CD"));
		obj.setInvoiceTypeCd(rs.getString("INVOICE_TYPE_CD"));
		obj.setOrderStatusMoveCd(rs.getString("ORDER_STATUS_MOVE_CD"));
		obj.setReturnReasonCd(rs.getString("RETURN_REASON_CD"));
		obj.setExpertSellerNbr(rs.getString("EXPERT_SELLER_NBR"));
		obj.setPoLineItemNbr(rs.getString("PO_LINE_ITEM_NBR"));
		obj.setShopTicketNbr(rs.getString("SHOP_TICKET_NBR"));
		obj.setQidInspectorId(rs.getString("QID_INSPECTOR_ID"));
		obj.setQidPullerId(rs.getString("QID_PULLER_ID"));
		obj.setCompleteIntgFl(rs.getString("COMPLETE_INTG_FL"));
		obj.setMiscChargeDesc(rs.getString("MISC_CHARGE_DESC"));
		obj.setFirstChgAddCostAmt(rs.getBigDecimal("FIRST_CHG_ADD_COST_AMT"));
		obj.setFirstChgAddAmt(rs.getBigDecimal("FIRST_CHG_ADD_AMT"));
		obj.setFirstChgAddReasonCd(rs.getString("FIRST_CHG_ADD_REASON_CD"));
		obj.setSecondChgAddCostAmt(rs.getBigDecimal("SECOND_CHG_ADD_COST_AMT"));
		obj.setSecondChgAddAmt(rs.getBigDecimal("SECOND_CHG_ADD_AMT"));
		obj.setSecondChgAddReasonCd(rs.getString("SECOND_CHG_ADD_REASON_CD"));
		obj.setAddCostUnitAmt(rs.getBigDecimal("ADD_COST_UNIT_AMT"));
		obj.setAddUCostReasonCd(rs.getString("ADD_UCOST_REASON_CD"));
		obj.setUsFirstChgAddAmt(rs.getBigDecimal("US_FIRST_CHG_ADD_AMT"));
		obj.setUsSecondChgAddAmt(rs.getBigDecimal("US_SECOND_CHG_ADD_AMT"));
		obj.setFirstChgAddTaxFl(rs.getString("FIRST_CHG_ADD_TAX_FL"));
		obj.setSecondChgAddTaxFl(rs.getString("SECOND_CHG_ADD_TAX_FL"));
		obj.setMktCostMult(rs.getBigDecimal("MKT_COST_MULT"));
		obj.setMktUnitCostAmt(rs.getBigDecimal("MKT_UNIT_COST_AMT"));
		obj.setMktAdjUnitCostAmt(rs.getBigDecimal("MKT_ADJ_UNIT_COST_AMT"));
		obj.setMktOrigCostAmt(rs.getBigDecimal("MKT_ORIG_COST_AMT"));
		obj.setInvoiceLineChangeAuditKey(rs.getLong("INVOICE_LINE_CHANGE_AUDIT_KEY"));
		obj.setOrigCustHazmatPrefCd(rs.getString("ORIG_CUST_HAZMAT_PREF_CD"));
		obj.setOrigLeadFreeFl(rs.getString("ORIG_LEAD_FREE_FL"));
		obj.setOrigRohsCompliantFl(rs.getString("ORIG_ROHS_COMPLIANT_FL"));
		obj.setOrigGreenCompliantFl(rs.getString("ORIG_GREEN_COMPLIANT_FL"));
		obj.setMarketCostOverrideFl(rs.getString("MARKET_COST_OVERRIDE_FL"));
		obj.setAfaReplenishCd(rs.getString("AFA_REPLENISH_CD"));
		obj.setSpecDrawingTx(rs.getString("SPEC_DRAWING_TX"));
		obj.setWrhsLocCd(rs.getString("WRHS_LOC_CD"));
		obj.setIcstPoId(rs.getString("ICST_PO_ID"));
		obj.setWmsCd(rs.getString("WMS_CD"));
		obj.setMfgCd(rs.getString("MFG_CD"));
		obj.setPartNbr(rs.getString("PART_NBR"));
		obj.setCustRefId1(rs.getString("CUST_REF_ID1"));
		obj.setCustRefId2(rs.getString("CUST_REF_ID2"));
		obj.setRequiredDt(rs.getDate("REQUIRED_DT"));
		obj.setSchedDt(rs.getDate("SCHED_DT"));
		obj.setOrderQty(rs.getInteger("ORDER_QTY"));
		obj.setShipDeQty(rs.getInteger("SHIP_DE_QTY"));
		obj.setDwMatchCd(rs.getString("DW_MATCH_CD"));
		obj.setDwRegNbr(rs.getString("DW_REG_NBR"));
		obj.setLoiAuthId(rs.getString("LOI_AUTH_ID"));
		obj.setLoiFl(rs.getString("LOI_FL"));
		obj.setCustMfgId(rs.getString("CUST_MFG_ID"));
		obj.setPoursitId(rs.getString("POURSIT_ID"));
		obj.setQidShipId(rs.getString("QID_SHIP_ID"));
		obj.setUserId(rs.getString("USER_ID"));
		obj.setAddChgFl(rs.getString("ADD_CHG_FL"));
		obj.setRedCostFl(rs.getString("RED_COST_FL"));
		obj.setError1Cd(rs.getString("ERROR1CD"));
		obj.setError2Cd(rs.getString("ERROR2CD"));
		obj.setError3Cd(rs.getString("ERROR3CD"));
		obj.setError4Cd(rs.getString("ERROR4CD"));
		obj.setError5Cd(rs.getString("ERROR5CD"));
		obj.setDwRegNo(rs.getString("DW_REG_NO"));
		obj.setConfirmPurgeFl(rs.getString("CONFIRM_PURGE_FL"));
		
		return obj;
	}

}
