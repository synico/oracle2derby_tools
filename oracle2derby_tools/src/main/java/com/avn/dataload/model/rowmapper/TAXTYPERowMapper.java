package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TAXTYPE;

public class TAXTYPERowMapper<T> implements RowMapper<TAXTYPE> {

    private static final Logger log = Logger.getLogger(TAXTYPERowMapper.class);

	@Override
	public TAXTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		TAXTYPE obj = new TAXTYPE();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTAXTYPE_ID(rs.getBigDecimal("TAXTYPE_ID"));
		obj.setTXCDSCHEME_ID(rs.getBigDecimal("TXCDSCHEME_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
