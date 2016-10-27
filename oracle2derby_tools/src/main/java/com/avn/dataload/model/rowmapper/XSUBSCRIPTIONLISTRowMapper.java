package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSUBSCRIPTIONLIST;

public class XSUBSCRIPTIONLISTRowMapper<T> implements RowMapper<XSUBSCRIPTIONLIST> {

    private static final Logger log = Logger.getLogger(XSUBSCRIPTIONLISTRowMapper.class);

	@Override
	public XSUBSCRIPTIONLIST mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSUBSCRIPTIONLIST obj = new XSUBSCRIPTIONLIST();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setSUBSCRIPTION_ID(rs.getBigDecimal("SUBSCRIPTION_ID"));
		obj.setSUBSCRIPTION_NAME(rs.getString("SUBSCRIPTION_NAME"));
		obj.setSOURCE_ID(rs.getBigDecimal("SOURCE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
