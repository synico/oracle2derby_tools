package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MASSOCTYPE;

public class MASSOCTYPERowMapper<T> implements RowMapper<MASSOCTYPE> {

    private static final Logger log = Logger.getLogger(MASSOCTYPERowMapper.class);

	@Override
	public MASSOCTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MASSOCTYPE obj = new MASSOCTYPE();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMASSOCTYPE_ID(rs.getString("MASSOCTYPE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setOID(rs.getString("OID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
