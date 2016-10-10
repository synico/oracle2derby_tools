package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRATTR;

public class MBRATTRRowMapper<T> implements RowMapper<MBRATTR> {

	@Override
	public MBRATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRATTR obj = new MBRATTR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setMBRATTR_ID(rs.getBigDecimal("MBRATTR_ID"));
		
		return obj;
	}

}
