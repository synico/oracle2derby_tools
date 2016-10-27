package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PREQENTRYTYPE;

public class PREQENTRYTYPERowMapper<T> implements RowMapper<PREQENTRYTYPE> {

    private static final Logger log = Logger.getLogger(PREQENTRYTYPERowMapper.class);

	@Override
	public PREQENTRYTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PREQENTRYTYPE obj = new PREQENTRYTYPE();
		
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setPREQENTRYTYPE_ID(rs.getBigDecimal("PREQENTRYTYPE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
