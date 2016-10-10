package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XUSERPYMNTRETRY;

public class XUSERPYMNTRETRYRowMapper<T> implements RowMapper<XUSERPYMNTRETRY> {

	@Override
	public XUSERPYMNTRETRY mapRow(ResultSet rs, int rowNum) throws SQLException {
		XUSERPYMNTRETRY obj = new XUSERPYMNTRETRY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setCVVINVALID(rs.getTimestamp("CVVINVALID"));
		obj.setXUSERPYMNTRETRY_ID(rs.getBigDecimal("XUSERPYMNTRETRY_ID"));
		obj.setFAILURE_COUNTER(rs.getBigDecimal("FAILURE_COUNTER"));
		
		return obj;
	}

}
