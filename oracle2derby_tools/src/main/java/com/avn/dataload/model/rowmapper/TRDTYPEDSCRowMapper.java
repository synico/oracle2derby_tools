package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TRDTYPEDSC;

public class TRDTYPEDSCRowMapper<T> implements RowMapper<TRDTYPEDSC> {

    private static final Logger log = Logger.getLogger(TRDTYPEDSCRowMapper.class);

	@Override
	public TRDTYPEDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		TRDTYPEDSC obj = new TRDTYPEDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setTRDTYPE_ID(rs.getBigDecimal("TRDTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
