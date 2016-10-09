package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XOrderSoftware;

public class XOrderSoftwareRowMapper<T> implements RowMapper<XOrderSoftware> {

	@Override
	public XOrderSoftware mapRow(ResultSet rs, int rowNum) throws SQLException {
		XOrderSoftware obj = new XOrderSoftware();
		
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setFirstNm(rs.getString("FIRST_NM"));
		obj.setLastNm(rs.getString("LAST_NM"));
		obj.setEmailAddressTx(rs.getString("EMAIL_ADDRESS_TX"));
		obj.setSoftwareProcessCd(rs.getString("SOFTWARE_PROCESS_CD"));
		obj.setSoftwareVoucherNo(rs.getString("SOFTWARE_VOUCHER_NO"));
		obj.setApplCreateDt(rs.getDate("APPL_CREATE_DT"));
		obj.setApplUpdateDt(rs.getDate("APPL_UPDATE_DT"));
		obj.setSoftwareAuthorizerCd(rs.getString("SOFTWARE_AUTHORIZER_CD"));
		
		return obj;
	}

}
