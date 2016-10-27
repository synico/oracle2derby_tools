package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAYSYNCH;

public class PAYSYNCHRowMapper<T> implements RowMapper<PAYSYNCH> {

    private static final Logger log = Logger.getLogger(PAYSYNCHRowMapper.class);

	@Override
	public PAYSYNCH mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAYSYNCH obj = new PAYSYNCH();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPAYSRFNBR(rs.getBigDecimal("PAYSRFNBR"));
		obj.setPAYSSTMP1(rs.getTimestamp("PAYSSTMP1"));
		obj.setPAYSSTMP2(rs.getTimestamp("PAYSSTMP2"));
		obj.setPAYSSTMP3(rs.getTimestamp("PAYSSTMP3"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
