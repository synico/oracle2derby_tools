package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATGPENREL;

public class CATGPENRELRowMapper<T> implements RowMapper<CATGPENREL> {

    private static final Logger log = Logger.getLogger(CATGPENRELRowMapper.class);

	@Override
	public CATGPENREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATGPENREL obj = new CATGPENREL();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setRULE(rs.getString("RULE"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
