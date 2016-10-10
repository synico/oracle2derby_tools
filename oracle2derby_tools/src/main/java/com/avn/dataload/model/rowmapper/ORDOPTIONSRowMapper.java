package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDOPTIONS;

public class ORDOPTIONSRowMapper<T> implements RowMapper<ORDOPTIONS> {

	@Override
	public ORDOPTIONS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDOPTIONS obj = new ORDOPTIONS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setNOTIFYMERCHANT(rs.getBigDecimal("NOTIFYMERCHANT"));
		obj.setNOTIFYSHOPPER(rs.getBigDecimal("NOTIFYSHOPPER"));
		
		return obj;
	}

}
