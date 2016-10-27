package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SUBSCPTYPE;

public class SUBSCPTYPERowMapper<T> implements RowMapper<SUBSCPTYPE> {

    private static final Logger log = Logger.getLogger(SUBSCPTYPERowMapper.class);

	@Override
	public SUBSCPTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		SUBSCPTYPE obj = new SUBSCPTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setSUBSCPTYPE_ID(rs.getString("SUBSCPTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
