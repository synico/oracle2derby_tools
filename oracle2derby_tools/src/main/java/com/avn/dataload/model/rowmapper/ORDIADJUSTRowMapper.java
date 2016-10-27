package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDIADJUST;

public class ORDIADJUSTRowMapper<T> implements RowMapper<ORDIADJUST> {

    private static final Logger log = Logger.getLogger(ORDIADJUSTRowMapper.class);

	@Override
	public ORDIADJUST mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDIADJUST obj = new ORDIADJUST();
		
		obj.setORDIADJUST_ID(rs.getBigDecimal("ORDIADJUST_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORDADJUST_ID(rs.getBigDecimal("ORDADJUST_ID"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setAMOUNT(rs.getBigDecimal("AMOUNT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
