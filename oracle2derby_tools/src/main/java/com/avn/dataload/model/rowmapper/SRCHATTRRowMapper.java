package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHATTR;

public class SRCHATTRRowMapper<T> implements RowMapper<SRCHATTR> {

	@Override
	public SRCHATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHATTR obj = new SRCHATTR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSRCHATTR_ID(rs.getBigDecimal("SRCHATTR_ID"));
		obj.setINDEXSCOPE(rs.getString("INDEXSCOPE"));
		obj.setINDEXTYPE(rs.getString("INDEXTYPE"));
		
		return obj;
	}

}
