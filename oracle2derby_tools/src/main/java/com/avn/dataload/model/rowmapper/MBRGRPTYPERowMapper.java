package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRGRPTYPE;

public class MBRGRPTYPERowMapper<T> implements RowMapper<MBRGRPTYPE> {

    private static final Logger log = Logger.getLogger(MBRGRPTYPERowMapper.class);

	@Override
	public MBRGRPTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRGRPTYPE obj = new MBRGRPTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setMBRGRPTYPE_ID(rs.getBigDecimal("MBRGRPTYPE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
