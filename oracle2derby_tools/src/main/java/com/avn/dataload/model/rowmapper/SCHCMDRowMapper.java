package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SCHCMD;

public class SCHCMDRowMapper<T> implements RowMapper<SCHCMD> {

    private static final Logger log = Logger.getLogger(SCHCMDRowMapper.class);

	@Override
	public SCHCMD mapRow(ResultSet rs, int rowNum) throws SQLException {
		SCHCMD obj = new SCHCMD();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSCHCMD_ID(rs.getBigDecimal("SCHCMD_ID"));
		obj.setPATHINFO(rs.getString("PATHINFO"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
