package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TRDTYPE;

public class TRDTYPERowMapper<T> implements RowMapper<TRDTYPE> {

    private static final Logger log = Logger.getLogger(TRDTYPERowMapper.class);

	@Override
	public TRDTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		TRDTYPE obj = new TRDTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTRDTYPE_ID(rs.getBigDecimal("TRDTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
