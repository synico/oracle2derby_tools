package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DsrSalesOrderSubset1;

public class DsrSalesOrderSubset1RowMapper<T> implements RowMapper<DsrSalesOrderSubset1> {

	@Override
	public DsrSalesOrderSubset1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		DsrSalesOrderSubset1 obj = new DsrSalesOrderSubset1();
		
		obj.setLastUpdateAction(rs.getString("LAST_UPDATE_ACTION"));
		obj.setShiptoCustNbr(rs.getString("SHIPTO_CUST_NBR"));
		obj.setCreateDt(rs.getDate("CREATE_DT"));
		obj.setUpdateDt(rs.getDate("UPDATE_DT"));
		obj.setReleaseId(rs.getString("RELEASE_ID"));
		obj.setCustPartNbr(rs.getString("CUST_PART_NBR"));
		obj.setConditionCd(rs.getString("CONDITION_CD"));
		obj.setOrderDt(rs.getDate("ORDER_DT"));
		obj.setMfgCd(rs.getString("MFG_CD"));
		obj.setPartNbr(rs.getString("PART_NBR"));
		obj.setCustPoId(rs.getString("CUST_PO_ID"));
		obj.setStatusCd(rs.getString("STATUS_CD"));
		obj.setBuyerName(rs.getString("BUYER_NAME"));
		obj.setShipperProgNbr(rs.getString("SHIPPER_PROG_NBR"));
		obj.setSupplierPartNbr(rs.getString("SUPPLIER_PART_NBR"));
		obj.setSupplierShortNm(rs.getString("SUPPLIER_SHORT_NM"));
		obj.setPromisedDelvDt(rs.getDate("PROMISED_DELV_DT"));
		obj.setReqdDelvDt(rs.getDate("REQD_DELV_DT"));
		obj.setSupplierId(rs.getString("SUPPLIER_ID"));
		obj.setStatusTx(rs.getString("STATUS_TX"));
		obj.setAvnetErpNm(rs.getString("AVNET_ERP_NM"));
		obj.setWcsOrderId(rs.getString("WCS_ORDER_ID"));
		
		return obj;
	}

}
