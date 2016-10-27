package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TFALGOTYPE;

public class TFALGOTYPERowMapper<T> implements RowMapper<TFALGOTYPE> {

    private static final Logger log = Logger.getLogger(TFALGOTYPERowMapper.class);

	@Override
	public TFALGOTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		TFALGOTYPE obj = new TFALGOTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTFALGOTYPE_ID(rs.getBigDecimal("TFALGOTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
