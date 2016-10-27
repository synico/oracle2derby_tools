package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRREL;

public class MBRRELRowMapper<T> implements RowMapper<MBRREL> {

    private static final Logger log = Logger.getLogger(MBRRELRowMapper.class);

	@Override
	public MBRREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRREL obj = new MBRREL();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCENDANT_ID(rs.getBigDecimal("DESCENDANT_ID"));
		obj.setANCESTOR_ID(rs.getBigDecimal("ANCESTOR_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
