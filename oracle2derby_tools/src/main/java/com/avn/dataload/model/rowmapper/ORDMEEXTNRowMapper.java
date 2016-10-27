package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDMEEXTN;

public class ORDMEEXTNRowMapper<T> implements RowMapper<ORDMEEXTN> {

    private static final Logger log = Logger.getLogger(ORDMEEXTNRowMapper.class);

	@Override
	public ORDMEEXTN mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDMEEXTN obj = new ORDMEEXTN();
		
		obj.setREQUESTEDSHIPTIME(rs.getTimestamp("REQUESTEDSHIPTIME"));
		obj.setBUYERORDERID(rs.getString("BUYERORDERID"));
		obj.setREQUESTEDTIME(rs.getTimestamp("REQUESTEDTIME"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setCOMMENTS1(rs.getString("COMMENTS1"));
		obj.setCOMMENTS2(rs.getString("COMMENTS2"));
		obj.setPAYLOADID(rs.getString("PAYLOADID"));
		obj.setORDERTYPE(rs.getString("ORDERTYPE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
