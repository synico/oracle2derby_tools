package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHREL;

public class ATCHRELRowMapper<T> implements RowMapper<ATCHREL> {

    private static final Logger log = Logger.getLogger(ATCHRELRowMapper.class);

	@Override
	public ATCHREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHREL obj = new ATCHREL();
		
		obj.setATCHTGT_ID(rs.getBigDecimal("ATCHTGT_ID"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATCHREL_ID(rs.getBigDecimal("ATCHREL_ID"));
		obj.setOBJECT_ID(rs.getString("OBJECT_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setATCHOBJTYP_ID(rs.getBigDecimal("ATCHOBJTYP_ID"));
		obj.setATCHRLUS_ID(rs.getBigDecimal("ATCHRLUS_ID"));
		obj.setBIGINTOBJECT_ID(rs.getBigDecimal("BIGINTOBJECT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
