package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSUBSCRIPTIONDESC;

public class XSUBSCRIPTIONDESCRowMapper<T> implements RowMapper<XSUBSCRIPTIONDESC> {

	@Override
	public XSUBSCRIPTIONDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSUBSCRIPTIONDESC obj = new XSUBSCRIPTIONDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSUBSCRIPTION_ID(rs.getBigDecimal("SUBSCRIPTION_ID"));
		
		return obj;
	}

}
