package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDOPTIONS;

public class ORDOPTIONSRowMapper<T> implements RowMapper<ORDOPTIONS> {

    private static final Logger log = Logger.getLogger(ORDOPTIONSRowMapper.class);

	@Override
	public ORDOPTIONS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDOPTIONS obj = new ORDOPTIONS();
		
		obj.setNOTIFYMERCHANT(rs.getBigDecimal("NOTIFYMERCHANT"));
		obj.setNOTIFYSHOPPER(rs.getBigDecimal("NOTIFYSHOPPER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
