package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CHKCMD;

public class CHKCMDRowMapper<T> implements RowMapper<CHKCMD> {

	@Override
	public CHKCMD mapRow(ResultSet rs, int rowNum) throws SQLException {
		CHKCMD obj = new CHKCMD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setCHKCMD_ID(rs.getBigDecimal("CHKCMD_ID"));
		obj.setINTERFACENAME(rs.getString("INTERFACENAME"));
		
		return obj;
	}

}
