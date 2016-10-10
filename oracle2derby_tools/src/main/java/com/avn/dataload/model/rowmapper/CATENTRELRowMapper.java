package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATENTREL;

public class CATENTRELRowMapper<T> implements RowMapper<CATENTREL> {

	@Override
	public CATENTREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATENTREL obj = new CATENTREL();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setGROUPNAME(rs.getString("GROUPNAME"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOID(rs.getString("OID"));
		obj.setCATENTRY_ID_PARENT(rs.getBigDecimal("CATENTRY_ID_PARENT"));
		obj.setCATRELTYPE_ID(rs.getString("CATRELTYPE_ID"));
		obj.setCATENTRY_ID_CHILD(rs.getBigDecimal("CATENTRY_ID_CHILD"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setMANDATORY(rs.getString("MANDATORY"));
		
		return obj;
	}

}
