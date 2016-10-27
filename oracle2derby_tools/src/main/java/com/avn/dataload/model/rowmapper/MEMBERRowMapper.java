package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MEMBER;

public class MEMBERRowMapper<T> implements RowMapper<MEMBER> {

    private static final Logger log = Logger.getLogger(MEMBERRowMapper.class);

	@Override
	public MEMBER mapRow(ResultSet rs, int rowNum) throws SQLException {
		MEMBER obj = new MEMBER();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
