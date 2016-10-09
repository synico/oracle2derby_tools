package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DsrInvoice;

public class DsrInvoiceRowMapper<T> implements RowMapper<DsrInvoice> {

	@Override
	public DsrInvoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		DsrInvoice obj = new DsrInvoice();
		
		obj.setLastUpdateAction(rs.getString("LAST_UPDATE_ACTION"));
		obj.setAuditLogKey(rs.getLong("AUDIT_LOG_KEY"));
		obj.setInvoiceCompany(rs.getString("INVOICE_COMPANY"));
		obj.setInvoiceSeqNbr(rs.getString("INVOICE_SEQ_NBR"));
		obj.setInvLineItemCnt(rs.getShort("INV_LINE_ITEM_CNT"));
		obj.setShiptoCustNbr(rs.getString("SHIPTO_CUST_NBR"));
		obj.setCustInvoiceNbr(rs.getInteger("CUST_INVOICE_NBR"));
		obj.setCustomerPoNbr(rs.getString("CUSTOMER_PO_NBR"));
		obj.setInvoiceTaxAmt(rs.getBigDecimal("INVOICE_TAX_AMT"));
		obj.setMiscChargeAmt(rs.getBigDecimal("MISC_CHARGE_AMT"));
		obj.setPartTotalAmt(rs.getBigDecimal("PART_TOTAL_AMT"));
		obj.setRestockChargeAmt(rs.getBigDecimal("RESTOCK_CHARGE_AMT"));
		obj.setCommissionPct(rs.getBigDecimal("COMMISSION_PCT"));
		obj.setInsideSlsmnId(rs.getString("INSIDE_SLSMN_ID"));
		obj.setActualCarrierCd(rs.getString("ACTUAL_CARRIER_CD"));
		obj.setCarrierOverrideTxt(rs.getString("CARRIER_OVERRIDE_TXT"));
		obj.setCarrierOvrrdRsnCd(rs.getString("CARRIER_OVRRD_RSN_CD"));
		obj.setFreightChargeCd(rs.getString("FREIGHT_CHARGE_CD"));
		obj.setFreightProcessedFl(rs.getString("FREIGHT_PROCESSED_FL"));
		obj.setQidPackerCd(rs.getString("QID_PACKER_CD"));
		obj.setShipViaOverrideCd(rs.getString("SHIP_VIA_OVERRIDE_CD"));
		obj.setInvoiceNbr(rs.getString("INVOICE_NBR"));
		obj.setCreateDt(rs.getDate("CREATE_DT"));
		obj.setUpdateDt(rs.getDate("UPDATE_DT"));
		obj.setDeleteDt(rs.getDate("DELETE_DT"));
		obj.setUpdateId(rs.getString("UPDATE_ID"));
		obj.setSystemId(rs.getString("SYSTEM_ID"));
		obj.setSegRcvdDt(rs.getDate("SEG_RCVD_DT"));
		obj.setDivisionId(rs.getString("DIVISION_ID"));
		obj.setScn(rs.getString("SCN"));
		obj.setInvoiceAmt(rs.getBigDecimal("INVOICE_AMT"));
		obj.setReleaseId(rs.getString("RELEASE_ID"));
		obj.setSlsmnField(rs.getString("SLSMN_FIELD"));
		obj.setSlsmnCsm(rs.getString("SLSMN_CSM"));
		obj.setSlsmnAsm(rs.getString("SLSMN_ASM"));
		obj.setSlsmnCsr(rs.getString("SLSMN_CSR"));
		obj.setSlsmnPss(rs.getString("SLSMN_PSS"));
		obj.setSlsmnTae(rs.getString("SLSMN_TAE"));
		obj.setSlsmnMisc1(rs.getString("SLSMN_MISC1"));
		obj.setSlsmnMisc2(rs.getString("SLSMN_MISC2"));
		obj.setSlsmnMisc3(rs.getString("SLSMN_MISC3"));
		obj.setSlsmnMisc4(rs.getString("SLSMN_MISC4"));
		obj.setSlsmnMisc5(rs.getString("SLSMN_MISC5"));
		obj.setSlsmnMisc6(rs.getString("SLSMN_MISC6"));
		obj.setSlsmnMisc7(rs.getString("SLSMN_MISC7"));
		obj.setSlsmnMisc8(rs.getString("SLSMN_MISC8"));
		obj.setSlsmnMisc9(rs.getString("SLSMN_MISC9"));
		obj.setCodAmt(rs.getBigDecimal("COD_AMT"));
		obj.setFobCd(rs.getString("FOB_CD"));
		obj.setFreightAmt(rs.getBigDecimal("FREIGHT_AMT"));
		obj.setMailFl(rs.getString("MAIL_FL"));
		obj.setPackageQty(rs.getInteger("PACKAGE_QTY"));
		obj.setShipViaCd(rs.getString("SHIP_VIA_CD"));
		obj.setWeightLbs(rs.getInteger("WEIGHT_LBS"));
		obj.setOrderDt(rs.getDate("ORDER_DT"));
		obj.setShipDt(rs.getDate("SHIP_DT"));
		obj.setWaybillId(rs.getString("WAYBILL_ID"));
		obj.setWrhsLocCd(rs.getString("WRHS_LOC_CD"));
		obj.setPayTermsCd(rs.getString("PAY_TERMS_CD"));
		obj.setIcstPoId(rs.getString("ICST_PO_ID"));
		obj.setIcstTypeCd(rs.getString("ICST_TYPE_CD"));
		obj.setMagPrintId(rs.getString("MAG_PRINT_ID"));
		obj.setPromFl(rs.getString("PROM_FL"));
		obj.setWmsCd(rs.getString("WMS_CD"));
		obj.setCustStNo(rs.getString("CUST_ST_NO"));
		obj.setFlatFrtCd(rs.getString("FLAT_FRT_CD"));
		obj.setFrtInsurAm(rs.getBigDecimal("FRT_INSUR_AM"));
		obj.setEmailFl(rs.getString("EMAIL_FL"));
		obj.setAuditLogDt(rs.getDate("AUDIT_LOG_DT"));
		obj.setShipViaOvrrdRsnCd(rs.getString("SHIP_VIA_OVRRD_RSN_CD"));
		obj.setShipViaOvrrdRsnTxt(rs.getString("SHIP_VIA_OVRRD_RSN_TXT"));
		obj.setFacilityStatusDs(rs.getString("FACILITY_STATUS_DS"));
		obj.setInventoryLocCd(rs.getString("INVENTORY_LOC_CD"));
		obj.setShipFirstFl(rs.getString("SHIP_FIRST_FL"));
		obj.setShipperCreateDt(rs.getDate("SHIPPER_CREATE_DT"));
		obj.setCreditDebitCd(rs.getString("CREDIT_DEBIT_CD"));
		obj.setCustTaxTypeCd(rs.getString("CUST_TAX_TYPE_CD"));
		obj.setPayMethodCd(rs.getString("PAY_METHOD_CD"));
		obj.setTradeTermsCd(rs.getString("TRADE_TERMS_CD"));
		obj.setLocalTaxPct(rs.getBigDecimal("LOCAL_TAX_PCT"));
		obj.setStateTaxPct(rs.getBigDecimal("STATE_TAX_PCT"));
		obj.setTaxCreditFl(rs.getString("TAX_CREDIT_FL"));
		obj.setStatusCutbackCnt(rs.getShort("STATUS_CUTBACK_CNT"));
		obj.setStatusInspCnt(rs.getShort("STATUS_INSP_CNT"));
		obj.setStatusInspDblCnt(rs.getShort("STATUS_INSP_DBL_CNT"));
		obj.setStatusInspTdskCnt(rs.getShort("STATUS_INSP_TDSK_CNT"));
		obj.setStatusLargeOrderCnt(rs.getShort("STATUS_LARGE_ORDER_CNT"));
		obj.setStatusPackCnt(rs.getShort("STATUS_PACK_CNT"));
		obj.setStatusPackDeCnt(rs.getShort("STATUS_PACK_DE_CNT"));
		obj.setStatusProductionCnt(rs.getShort("STATUS_PRODUCTION_CNT"));
		obj.setStatusWrhsTdskCnt(rs.getShort("STATUS_WRHS_TDSK_CNT"));
		obj.setTaxRateGeoStateCd(rs.getString("TAX_RATE_GEO_STATE_CD"));
		obj.setTaxRateGeoCountyCd(rs.getString("TAX_RATE_GEO_COUNTY_CD"));
		obj.setTaxRateGeoCityCd(rs.getString("TAX_RATE_GEO_CITY_CD"));
		obj.setQidInspector1Cd(rs.getString("QID_INSPECTOR1CD"));
		obj.setQidInspector2Cd(rs.getString("QID_INSPECTOR2CD"));
		obj.setQidInspector3Cd(rs.getString("QID_INSPECTOR3CD"));
		obj.setQidLastUpdate(rs.getString("QID_LAST_UPDATE"));
		obj.setAsrsLastPrint(rs.getString("ASRS_LAST_PRINT"));
		obj.setComplete2006Fl(rs.getString("COMPLETE2006FL"));
		obj.setCompleteReleaseFl(rs.getString("COMPLETE_RELEASE_FL"));
		obj.setConfirmPurgeFl(rs.getString("CONFIRM_PURGE_FL"));
		obj.setSegmentCreateCd(rs.getString("SEGMENT_CREATE_CD"));
		obj.setInvoiceChangeAuditKey(rs.getBigDecimal("INVOICE_CHANGE_AUDIT_KEY"));
		obj.setBilltoCustNbr(rs.getString("BILLTO_CUST_NBR"));
		obj.setCompanyStNo(rs.getString("COMPANY_ST_NO"));
		obj.setCustAcctStNo(rs.getString("CUST_ACCT_ST_NO"));
		obj.setCustLocStNo(rs.getString("CUST_LOC_ST_NO"));
		obj.setFlatFreightAm(rs.getBigDecimal("FLAT_FREIGHT_AM"));
		obj.setIvcOriginalNo(rs.getString("IVC_ORIGINAL_NO"));
		obj.setFrtCustPartialAm(rs.getBigDecimal("FRT_CUST_PARTIAL_AM"));
		obj.setStdHandlingAm(rs.getBigDecimal("STD_HANDLING_AM"));
		obj.setSplitPrevInvoiceNbr(rs.getString("SPLIT_PREV_INVOICE_NBR"));
		obj.setSplitInvoiceCd(rs.getString("SPLIT_INVOICE_CD"));
		
		return obj;
	}

}
