package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CTXDATA;

public class CTXDATARowMapper<T> implements RowMapper<CTXDATA> {

    private static final Logger log = Logger.getLogger(CTXDATARowMapper.class);

	@Override
	public CTXDATA mapRow(ResultSet rs, int rowNum) throws SQLException {
		CTXDATA obj = new CTXDATA();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setACTIVITY_ID(rs.getBigDecimal("ACTIVITY_ID"));
		obj.setSERVALUE(rs.getString("SERVALUE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
