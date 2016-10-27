package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EXPTYPE;

public class EXPTYPERowMapper<T> implements RowMapper<EXPTYPE> {

    private static final Logger log = Logger.getLogger(EXPTYPERowMapper.class);

	@Override
	public EXPTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		EXPTYPE obj = new EXPTYPE();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setEXPTYPE_ID(rs.getBigDecimal("EXPTYPE_ID"));
		obj.setIMPLCLS(rs.getString("IMPLCLS"));
		obj.setOBJCLS(rs.getString("OBJCLS"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
