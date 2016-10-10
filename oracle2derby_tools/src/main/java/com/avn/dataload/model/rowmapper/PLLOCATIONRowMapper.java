package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLLOCATION;

public class PLLOCATIONRowMapper<T> implements RowMapper<PLLOCATION> {

	@Override
	public PLLOCATION mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLLOCATION obj = new PLLOCATION();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setPAGELAYOUT_ID(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setPLLOCATION_ID(rs.getBigDecimal("PLLOCATION_ID"));
		obj.setGROUPNUMBER(rs.getBigDecimal("GROUPNUMBER"));
		
		return obj;
	}

}
