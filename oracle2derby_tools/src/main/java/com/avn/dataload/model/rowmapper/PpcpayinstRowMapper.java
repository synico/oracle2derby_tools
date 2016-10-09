package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ppcpayinst;

public class PpcpayinstRowMapper<T> implements RowMapper<Ppcpayinst> {

	@Override
	public Ppcpayinst mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ppcpayinst obj = new Ppcpayinst();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setAmount(rs.getBigDecimal("AMOUNT"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		obj.setPpcpayinstId(rs.getBigDecimal("PPCPAYINST_ID"));
		obj.setApprovingamount(rs.getBigDecimal("APPROVINGAMOUNT"));
		obj.setApprovedamount(rs.getBigDecimal("APPROVEDAMOUNT"));
		obj.setCreditingamount(rs.getBigDecimal("CREDITINGAMOUNT"));
		obj.setCreditedamount(rs.getBigDecimal("CREDITEDAMOUNT"));
		obj.setDepositingamount(rs.getBigDecimal("DEPOSITINGAMOUNT"));
		obj.setDepositedamount(rs.getBigDecimal("DEPOSITEDAMOUNT"));
		obj.setRvrsngaprvedamnt(rs.getBigDecimal("RVRSNGAPRVEDAMNT"));
		obj.setRvrsngdpstedamnt(rs.getBigDecimal("RVRSNGDPSTEDAMNT"));
		obj.setRvrsngcrdtedamnt(rs.getBigDecimal("RVRSNGCRDTEDAMNT"));
		obj.setPaymentsystemname(rs.getString("PAYMENTSYSTEMNAME"));
		obj.setAccountnumber(rs.getString("ACCOUNTNUMBER"));
		obj.setPayconfigid(rs.getString("PAYCONFIGID"));
		obj.setPluginname(rs.getString("PLUGINNAME"));
		obj.setOrderId(rs.getBigDecimal("ORDER_ID"));
		obj.setRmaId(rs.getBigDecimal("RMA_ID"));
		
		return obj;
	}

}
