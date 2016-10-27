package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLRCPTS;

public class EMLRCPTSRowMapper<T> implements RowMapper<EMLRCPTS> {

    private static final Logger log = Logger.getLogger(EMLRCPTSRowMapper.class);

	@Override
	public EMLRCPTS mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLRCPTS obj = new EMLRCPTS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCOUNT(rs.getBigDecimal("COUNT"));
		obj.setRECIPIENTS(rs.getClob("RECIPIENTS"));
		obj.setEMLPROMO_ID(rs.getBigDecimal("EMLPROMO_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
