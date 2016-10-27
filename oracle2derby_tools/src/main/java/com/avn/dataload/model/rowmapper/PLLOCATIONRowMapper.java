package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLLOCATION;

public class PLLOCATIONRowMapper<T> implements RowMapper<PLLOCATION> {

    private static final Logger log = Logger.getLogger(PLLOCATIONRowMapper.class);

	@Override
	public PLLOCATION mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLLOCATION obj = new PLLOCATION();
		
		obj.setPAGELAYOUT_ID(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setPLLOCATION_ID(rs.getBigDecimal("PLLOCATION_ID"));
		obj.setGROUPNUMBER(rs.getBigDecimal("GROUPNUMBER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
