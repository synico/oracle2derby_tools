package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PREQENTRYTYPE;

public class PREQENTRYTYPERowMapper<T> implements RowMapper<PREQENTRYTYPE> {

	@Override
	public PREQENTRYTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PREQENTRYTYPE obj = new PREQENTRYTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setPREQENTRYTYPE_ID(rs.getBigDecimal("PREQENTRYTYPE_ID"));
		
		return obj;
	}

}
