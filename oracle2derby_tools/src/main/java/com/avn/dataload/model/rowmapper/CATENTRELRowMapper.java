package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATENTREL;

public class CATENTRELRowMapper<T> implements RowMapper<CATENTREL> {

    private static final Logger log = Logger.getLogger(CATENTRELRowMapper.class);

	@Override
	public CATENTREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATENTREL obj = new CATENTREL();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setGROUPNAME(rs.getString("GROUPNAME"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setMANDATORY(rs.getString("MANDATORY"));
		obj.setOID(rs.getString("OID"));
		obj.setCATENTRY_ID_PARENT(rs.getBigDecimal("CATENTRY_ID_PARENT"));
		obj.setCATRELTYPE_ID(rs.getString("CATRELTYPE_ID"));
		obj.setCATENTRY_ID_CHILD(rs.getBigDecimal("CATENTRY_ID_CHILD"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
