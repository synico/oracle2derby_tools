package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ITEMTYPE;

public class ITEMTYPERowMapper<T> implements RowMapper<ITEMTYPE> {

    private static final Logger log = Logger.getLogger(ITEMTYPERowMapper.class);

	@Override
	public ITEMTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		ITEMTYPE obj = new ITEMTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setITEMTYPE_ID(rs.getString("ITEMTYPE_ID"));
		obj.setOID(rs.getString("OID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
