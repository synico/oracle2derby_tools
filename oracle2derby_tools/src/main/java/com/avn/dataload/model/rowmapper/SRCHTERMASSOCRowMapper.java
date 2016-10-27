package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHTERMASSOC;

public class SRCHTERMASSOCRowMapper<T> implements RowMapper<SRCHTERMASSOC> {

    private static final Logger log = Logger.getLogger(SRCHTERMASSOCRowMapper.class);

	@Override
	public SRCHTERMASSOC mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHTERMASSOC obj = new SRCHTERMASSOC();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSCOPE(rs.getString("SCOPE"));
		obj.setSRCHTERMASSOC_ID(rs.getBigDecimal("SRCHTERMASSOC_ID"));
		obj.setASSOCIATIONTYPE(rs.getBigDecimal("ASSOCIATIONTYPE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
