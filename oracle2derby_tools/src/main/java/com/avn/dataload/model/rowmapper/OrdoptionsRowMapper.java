package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordoptions;

public class OrdoptionsRowMapper<T> implements RowMapper<Ordoptions> {

	@Override
	public Ordoptions mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordoptions obj = new Ordoptions();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNotifymerchant(rs.getBigDecimal("NOTIFYMERCHANT"));
		obj.setNotifyshopper(rs.getBigDecimal("NOTIFYSHOPPER"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
