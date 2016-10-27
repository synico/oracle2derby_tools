package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XUSERPYMNTRETRY;

public class XUSERPYMNTRETRYRowMapper<T> implements RowMapper<XUSERPYMNTRETRY> {

    private static final Logger log = Logger.getLogger(XUSERPYMNTRETRYRowMapper.class);

	@Override
	public XUSERPYMNTRETRY mapRow(ResultSet rs, int rowNum) throws SQLException {
		XUSERPYMNTRETRY obj = new XUSERPYMNTRETRY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCVVINVALID(rs.getTimestamp("CVVINVALID"));
		obj.setXUSERPYMNTRETRY_ID(rs.getBigDecimal("XUSERPYMNTRETRY_ID"));
		obj.setFAILURE_COUNTER(rs.getBigDecimal("FAILURE_COUNTER"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
