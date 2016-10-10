package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DEVICEFMT;

public class DEVICEFMTRowMapper<T> implements RowMapper<DEVICEFMT> {

	@Override
	public DEVICEFMT mapRow(ResultSet rs, int rowNum) throws SQLException {
		DEVICEFMT obj = new DEVICEFMT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDEVICETYPE_ID(rs.getString("DEVICETYPE_ID"));
		obj.setDEVICEFMT_ID(rs.getBigDecimal("DEVICEFMT_ID"));
		
		return obj;
	}

}
