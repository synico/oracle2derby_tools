package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSUBSCRIPTIONLIST;

public class XSUBSCRIPTIONLISTRowMapper<T> implements RowMapper<XSUBSCRIPTIONLIST> {

	@Override
	public XSUBSCRIPTIONLIST mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSUBSCRIPTIONLIST obj = new XSUBSCRIPTIONLIST();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setSOURCE_ID(rs.getBigDecimal("SOURCE_ID"));
		obj.setSUBSCRIPTION_ID(rs.getBigDecimal("SUBSCRIPTION_ID"));
		obj.setSUBSCRIPTION_NAME(rs.getString("SUBSCRIPTION_NAME"));
		
		return obj;
	}

}
