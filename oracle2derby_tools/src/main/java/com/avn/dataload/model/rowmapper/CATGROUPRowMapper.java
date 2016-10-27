package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATGROUP;

public class CATGROUPRowMapper<T> implements RowMapper<CATGROUP> {

    private static final Logger log = Logger.getLogger(CATGROUPRowMapper.class);

	@Override
	public CATGROUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATGROUP obj = new CATGROUP();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setRANK(rs.getBigDecimal("RANK"));
		obj.setDYNAMIC(rs.getBigDecimal("DYNAMIC"));
		obj.setOID(rs.getString("OID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
