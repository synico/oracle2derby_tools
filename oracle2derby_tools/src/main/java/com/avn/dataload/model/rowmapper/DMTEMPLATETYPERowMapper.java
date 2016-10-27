package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMTEMPLATETYPE;

public class DMTEMPLATETYPERowMapper<T> implements RowMapper<DMTEMPLATETYPE> {

    private static final Logger log = Logger.getLogger(DMTEMPLATETYPERowMapper.class);

	@Override
	public DMTEMPLATETYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMTEMPLATETYPE obj = new DMTEMPLATETYPE();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setDMTEMPLATETYPE_ID(rs.getBigDecimal("DMTEMPLATETYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
