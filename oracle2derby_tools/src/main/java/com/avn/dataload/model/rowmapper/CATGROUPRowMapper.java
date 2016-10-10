package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATGROUP;

public class CATGROUPRowMapper<T> implements RowMapper<CATGROUP> {

	@Override
	public CATGROUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATGROUP obj = new CATGROUP();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOID(rs.getString("OID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setRANK(rs.getBigDecimal("RANK"));
		obj.setDYNAMIC(rs.getBigDecimal("DYNAMIC"));
		
		return obj;
	}

}
