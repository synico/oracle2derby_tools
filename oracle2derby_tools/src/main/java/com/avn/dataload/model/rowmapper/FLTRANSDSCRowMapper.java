package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLTRANSDSC;

public class FLTRANSDSCRowMapper<T> implements RowMapper<FLTRANSDSC> {

    private static final Logger log = Logger.getLogger(FLTRANSDSCRowMapper.class);

	@Override
	public FLTRANSDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLTRANSDSC obj = new FLTRANSDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLTRANSITN_ID(rs.getBigDecimal("FLTRANSITN_ID"));
		obj.setTRANSITIONDESC(rs.getString("TRANSITIONDESC"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setEVENTDESC(rs.getString("EVENTDESC"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
