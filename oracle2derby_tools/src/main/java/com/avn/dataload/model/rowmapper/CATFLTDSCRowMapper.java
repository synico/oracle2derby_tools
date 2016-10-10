package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATFLTDSC;

public class CATFLTDSCRowMapper<T> implements RowMapper<CATFLTDSC> {

	@Override
	public CATFLTDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATFLTDSC obj = new CATFLTDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		
		return obj;
	}

}
