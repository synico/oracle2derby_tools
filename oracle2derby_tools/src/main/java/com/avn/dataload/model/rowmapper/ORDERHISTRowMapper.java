package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDERHIST;

public class ORDERHISTRowMapper<T> implements RowMapper<ORDERHIST> {

    private static final Logger log = Logger.getLogger(ORDERHISTRowMapper.class);

	@Override
	public ORDERHIST mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDERHIST obj = new ORDERHIST();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getTimestamp("FIELD3"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setORDERVERSION(rs.getBigDecimal("ORDERVERSION"));
		obj.setORDXML(rs.getClob("ORDXML"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
