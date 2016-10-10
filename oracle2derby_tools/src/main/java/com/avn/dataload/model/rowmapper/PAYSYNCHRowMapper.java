package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAYSYNCH;

public class PAYSYNCHRowMapper<T> implements RowMapper<PAYSYNCH> {

	@Override
	public PAYSYNCH mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAYSYNCH obj = new PAYSYNCH();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPAYSRFNBR(rs.getBigDecimal("PAYSRFNBR"));
		obj.setPAYSSTMP1(rs.getTimestamp("PAYSSTMP1"));
		obj.setPAYSSTMP2(rs.getTimestamp("PAYSSTMP2"));
		obj.setPAYSSTMP3(rs.getTimestamp("PAYSSTMP3"));
		
		return obj;
	}

}
