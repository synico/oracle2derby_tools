package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcCustomer;

public class XZfcCustomerRowMapper<T> implements RowMapper<XZfcCustomer> {

	@Override
	public XZfcCustomer mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcCustomer obj = new XZfcCustomer();
		
		obj.setVmi(rs.getString("VMI"));
		obj.setWerks(rs.getString("WERKS"));
		obj.setErzeit(rs.getDate("ERZEIT"));
		obj.setFcperiod(rs.getString("FCPERIOD"));
		obj.setNet(rs.getString("NET"));
		obj.setNetQoh(rs.getString("NET_QOH"));
		obj.setConsignment(rs.getString("CONSIGNMENT"));
		obj.setUpdatedFlag(rs.getString("UPDATED_FLAG"));
		
		return obj;
	}

}
