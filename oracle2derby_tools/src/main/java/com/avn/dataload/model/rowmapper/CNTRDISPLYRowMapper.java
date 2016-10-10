package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CNTRDISPLY;

public class CNTRDISPLYRowMapper<T> implements RowMapper<CNTRDISPLY> {

	@Override
	public CNTRDISPLY mapRow(ResultSet rs, int rowNum) throws SQLException {
		CNTRDISPLY obj = new CNTRDISPLY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCONTRACT_ID(rs.getBigDecimal("CONTRACT_ID"));
		obj.setDEVICEFMT_ID(rs.getBigDecimal("DEVICEFMT_ID"));
		obj.setCNTRDISPLY_ID(rs.getBigDecimal("CNTRDISPLY_ID"));
		obj.setPARTROLE_ID(rs.getBigDecimal("PARTROLE_ID"));
		obj.setDISPLAYPAGENAME(rs.getString("DISPLAYPAGENAME"));
		
		return obj;
	}

}
