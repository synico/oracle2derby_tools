package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHTERM;

public class SRCHTERMRowMapper<T> implements RowMapper<SRCHTERM> {

	@Override
	public SRCHTERM mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHTERM obj = new SRCHTERM();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setSRCHTERMASSOC_ID(rs.getBigDecimal("SRCHTERMASSOC_ID"));
		obj.setTERM(rs.getString("TERM"));
		
		return obj;
	}

}
