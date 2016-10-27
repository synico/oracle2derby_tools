package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMACTTYPE;

public class DMACTTYPERowMapper<T> implements RowMapper<DMACTTYPE> {

    private static final Logger log = Logger.getLogger(DMACTTYPERowMapper.class);

	@Override
	public DMACTTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMACTTYPE obj = new DMACTTYPE();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setDMACTTYPE_ID(rs.getBigDecimal("DMACTTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
