package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFTASKDSC;

public class CMFTASKDSCRowMapper<T> implements RowMapper<CMFTASKDSC> {

	@Override
	public CMFTASKDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFTASKDSC obj = new CMFTASKDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCMFTASK_ID(rs.getBigDecimal("CMFTASK_ID"));
		
		return obj;
	}

}
