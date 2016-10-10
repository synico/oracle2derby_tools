package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECONF;

public class STORECONFRowMapper<T> implements RowMapper<STORECONF> {

	@Override
	public STORECONF mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECONF obj = new STORECONF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setVALUE(rs.getString("VALUE"));
		
		return obj;
	}

}
