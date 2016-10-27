package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSUBSCRIPTIONDESC;

public class XSUBSCRIPTIONDESCRowMapper<T> implements RowMapper<XSUBSCRIPTIONDESC> {

    private static final Logger log = Logger.getLogger(XSUBSCRIPTIONDESCRowMapper.class);

	@Override
	public XSUBSCRIPTIONDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSUBSCRIPTIONDESC obj = new XSUBSCRIPTIONDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSUBSCRIPTION_ID(rs.getBigDecimal("SUBSCRIPTION_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
