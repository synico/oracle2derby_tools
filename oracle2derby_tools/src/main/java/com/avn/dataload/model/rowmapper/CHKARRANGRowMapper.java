package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CHKARRANG;

public class CHKARRANGRowMapper<T> implements RowMapper<CHKARRANG> {

    private static final Logger log = Logger.getLogger(CHKARRANGRowMapper.class);

	@Override
	public CHKARRANG mapRow(ResultSet rs, int rowNum) throws SQLException {
		CHKARRANG obj = new CHKARRANG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCHKCMD_ID(rs.getBigDecimal("CHKCMD_ID"));
		obj.setSCHCMD_ID(rs.getBigDecimal("SCHCMD_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
