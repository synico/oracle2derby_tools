package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ADDRBOOK;

public class ADDRBOOKRowMapper<T> implements RowMapper<ADDRBOOK> {

    private static final Logger log = Logger.getLogger(ADDRBOOKRowMapper.class);

	@Override
	public ADDRBOOK mapRow(ResultSet rs, int rowNum) throws SQLException {
		ADDRBOOK obj = new ADDRBOOK();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setADDRBOOK_ID(rs.getBigDecimal("ADDRBOOK_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setDISPLAYNAME(rs.getString("DISPLAYNAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
