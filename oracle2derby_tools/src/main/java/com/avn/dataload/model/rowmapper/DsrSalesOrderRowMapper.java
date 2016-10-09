package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DsrSalesOrder;

public class DsrSalesOrderRowMapper<T> implements RowMapper<DsrSalesOrder> {

	@Override
	public DsrSalesOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
		DsrSalesOrder obj = new DsrSalesOrder();
		
		obj.setLastUpdateAction(rs.getString("LAST_UPDATE_ACTION"));
		obj.setAuditLogKey(rs.getLong("AUDIT_LOG_KEY"));
		obj.setShiptoCustNbr(rs.getString("SHIPTO_CUST_NBR"));
		obj.setCreateDt(rs.getDate("CREATE_DT"));
		obj.setUpdateDt(rs.getDate("UPDATE_DT"));
		obj.setDeleteDt(rs.getDate("DELETE_DT"));
		obj.setUpdateId(rs.getString("UPDATE_ID"));
		obj.setSystemId(rs.getString("SYSTEM_ID"));
		obj.setSegRcvdDt(rs.getDate("SEG_RCVD_DT"));
		obj.setDivisionId(rs.getString("DIVISION_ID"));
		obj.setScn(rs.getString("SCN"));
		obj.setReleaseId(rs.getString("RELEASE_ID"));
		obj.setSalesOrderCompany(rs.getString("SALES_ORDER_COMPANY"));
		obj.setOrderTypeCd(rs.getString("ORDER_TYPE_CD"));
		obj.setGovtContractId(rs.getString("GOVT_CONTRACT_ID"));
		obj.setAuthorizerName(rs.getString("AUTHORIZER_NAME"));
		obj.setSoLineItemCnt(rs.getShort("SO_LINE_ITEM_CNT"));
		obj.setFobCd(rs.getString("FOB_CD"));
		obj.setOrderDt(rs.getDate("ORDER_DT"));
		obj.setPayTermsCd(rs.getString("PAY_TERMS_CD"));
		obj.setCustStNo(rs.getString("CUST_ST_NO"));
		obj.setFlatFrtCd(rs.getString("FLAT_FRT_CD"));
		obj.setScnSeqNbr(rs.getString("SCN_SEQ_NBR"));
		obj.setCustPoId(rs.getString("CUST_PO_ID"));
		obj.setCloseDt(rs.getDate("CLOSE_DT"));
		obj.setStatusCd(rs.getString("STATUS_CD"));
		obj.setReasonCd(rs.getString("REASON_CD"));
		obj.setForecastId(rs.getString("FORECAST_ID"));
		obj.setBuyerName(rs.getString("BUYER_NAME"));
		obj.setSpecTxt(rs.getString("SPEC_TXT"));
		obj.setCommentTxt(rs.getString("COMMENT_TXT"));
		obj.setPriorityCd(rs.getString("PRIORITY_CD"));
		obj.setWebUserNbr(rs.getString("WEB_USER_NBR"));
		obj.setPlnFl(rs.getString("PLN_FL"));
		obj.setHotShipFl(rs.getString("HOT_SHIP_FL"));
		obj.setFdsPoCnt(rs.getShort("FDS_PO_CNT"));
		obj.setShcCntlCd(rs.getString("SHC_CNTL_CD"));
		obj.setWebUserId(rs.getString("WEB_USER_ID"));
		obj.setShipFirstFl(rs.getString("SHIP_FIRST_FL"));
		obj.setCustTaxTypeCd(rs.getString("CUST_TAX_TYPE_CD"));
		obj.setPayMethodCd(rs.getString("PAY_METHOD_CD"));
		obj.setTradeTermsCd(rs.getString("TRADE_TERMS_CD"));
		obj.setBilltoCustNbr(rs.getString("BILLTO_CUST_NBR"));
		obj.setCompanyStNo(rs.getString("COMPANY_ST_NO"));
		obj.setCustAcctStNo(rs.getString("CUST_ACCT_ST_NO"));
		obj.setCustLocStNo(rs.getString("CUST_LOC_ST_NO"));
		obj.setFlatFreightAm(rs.getBigDecimal("FLAT_FREIGHT_AM"));
		obj.setPurgeOrderFl(rs.getString("PURGE_ORDER_FL"));
		obj.setLastUpdateId(rs.getString("LAST_UPDATE_ID"));
		obj.setBuyerAreaCodeNbr(rs.getString("BUYER_AREA_CODE_NBR"));
		obj.setBuyerPhoneNbr(rs.getString("BUYER_PHONE_NBR"));
		obj.setBuyerPhoneExtNbr(rs.getString("BUYER_PHONE_EXT_NBR"));
		obj.setSpecDrawingTxt(rs.getString("SPEC_DRAWING_TXT"));
		obj.setSpclInstTxt(rs.getString("SPCL_INST_TXT"));
		obj.setInternalInstTxt(rs.getString("INTERNAL_INST_TXT"));
		obj.setSlsmnInsideId(rs.getString("SLSMN_INSIDE_ID"));
		obj.setFrtChargeCd(rs.getString("FRT_CHARGE_CD"));
		obj.setTotalValueAmt(rs.getBigDecimal("TOTAL_VALUE_AMT"));
		obj.setShipCompleteCd(rs.getString("SHIP_COMPLETE_CD"));
		obj.setOverrideCustFl(rs.getString("OVERRIDE_CUST_FL"));
		obj.setDwOrderTypeCd(rs.getString("DW_ORDER_TYPE_CD"));
		obj.setOrigCarrierCd(rs.getString("ORIG_CARRIER_CD"));
		obj.setCarrierBalCd(rs.getString("CARRIER_BAL_CD"));
		obj.setCarrierAcctId(rs.getString("CARRIER_ACCT_ID"));
		obj.setAuthTermsCd(rs.getString("AUTH_TERMS_CD"));
		obj.setAuthTermsId(rs.getString("AUTH_TERMS_ID"));
		obj.setAuthTradeTermsCd(rs.getString("AUTH_TRADE_TERMS_CD"));
		obj.setAuthTradeTermsId(rs.getString("AUTH_TRADE_TERMS_ID"));
		obj.setCreditHoldFl(rs.getString("CREDIT_HOLD_FL"));
		obj.setCreditCatCd(rs.getString("CREDIT_CAT_CD"));
		obj.setWebOrderDivision(rs.getString("WEB_ORDER_DIVISION"));
		obj.setWebOrderNbr(rs.getInteger("WEB_ORDER_NBR"));
		obj.setWebUserDivision(rs.getString("WEB_USER_DIVISION"));
		obj.setWebFreightAmt(rs.getBigDecimal("WEB_FREIGHT_AMT"));
		obj.setWebHandlingAmt(rs.getBigDecimal("WEB_HANDLING_AMT"));
		obj.setWebEmailAddrTxt(rs.getString("WEB_EMAIL_ADDR_TXT"));
		obj.setRenegotiateFl(rs.getString("RENEGOTIATE_FL"));
		obj.setB2bIdentifierCd(rs.getString("B2B_IDENTIFIER_CD"));
		obj.setMiscEmailFl(rs.getString("MISC_EMAIL_FL"));
		obj.setLastAccessedDtTxt(rs.getString("LAST_ACCESSED_DT_TXT"));
		obj.setLastAccessedTmTxt(rs.getString("LAST_ACCESSED_TM_TXT"));
		obj.setDateStampNbr(rs.getInteger("DATE_STAMP_NBR"));
		obj.setTimeStampNbr(rs.getInteger("TIME_STAMP_NBR"));
		obj.setOrderChangeAuditKey(rs.getBigDecimal("ORDER_CHANGE_AUDIT_KEY"));
		obj.setContractStartDt(rs.getDate("CONTRACT_START_DT"));
		obj.setContractEndDt(rs.getDate("CONTRACT_END_DT"));
		obj.setInvoiceOkFl(rs.getString("INVOICE_OK_FL"));
		obj.setEntitlementFl(rs.getString("ENTITLEMENT_FL"));
		obj.setBillingFrequencyTx(rs.getString("BILLING_FREQUENCY_TX"));
		obj.setServiceContractId(rs.getString("SERVICE_CONTRACT_ID"));
		obj.setOrderCustPoAlKey(rs.getBigDecimal("ORDER_CUST_PO_AL_KEY"));
		obj.setReservationOrderCd(rs.getString("RESERVATION_ORDER_CD"));
		obj.setApoQt(rs.getShort("APO_QT"));
		
		return obj;
	}

}
