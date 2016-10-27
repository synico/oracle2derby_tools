package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CHKCMD;

public class CHKCMDRowMapper<T> implements RowMapper<CHKCMD> {

    private static final Logger log = Logger.getLogger(CHKCMDRowMapper.class);

	@Override
	public CHKCMD mapRow(ResultSet rs, int rowNum) throws SQLException {
		CHKCMD obj = new CHKCMD();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCHKCMD_ID(rs.getBigDecimal("CHKCMD_ID"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setINTERFACENAME(rs.getString("INTERFACENAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
