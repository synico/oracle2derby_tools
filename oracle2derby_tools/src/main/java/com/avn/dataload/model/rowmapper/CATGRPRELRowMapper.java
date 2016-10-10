package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATGRPREL;

public class CATGRPRELRowMapper<T> implements RowMapper<CATGRPREL> {

	@Override
	public CATGRPREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATGRPREL obj = new CATGRPREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setCATGROUP_ID_PARENT(rs.getBigDecimal("CATGROUP_ID_PARENT"));
		obj.setCATGROUP_ID_CHILD(rs.getBigDecimal("CATGROUP_ID_CHILD"));
		obj.setCATALOG_ID_LINK(rs.getBigDecimal("CATALOG_ID_LINK"));
		obj.setRULE(rs.getString("RULE"));
		
		return obj;
	}

}
