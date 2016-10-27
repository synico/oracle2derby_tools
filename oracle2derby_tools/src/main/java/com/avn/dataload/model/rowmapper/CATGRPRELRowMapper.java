package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATGRPREL;

public class CATGRPRELRowMapper<T> implements RowMapper<CATGRPREL> {

    private static final Logger log = Logger.getLogger(CATGRPRELRowMapper.class);

	@Override
	public CATGRPREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATGRPREL obj = new CATGRPREL();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setRULE(rs.getString("RULE"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setCATGROUP_ID_PARENT(rs.getBigDecimal("CATGROUP_ID_PARENT"));
		obj.setCATGROUP_ID_CHILD(rs.getBigDecimal("CATGROUP_ID_CHILD"));
		obj.setCATALOG_ID_LINK(rs.getBigDecimal("CATALOG_ID_LINK"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
