package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDCHGRSNDS;

public class ORDCHGRSNDSRowMapper<T> implements RowMapper<ORDCHGRSNDS> {

	@Override
	public ORDCHGRSNDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDCHGRSNDS obj = new ORDCHGRSNDS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setORDCHGRSN_ID(rs.getBigDecimal("ORDCHGRSN_ID"));
		
		return obj;
	}

}
