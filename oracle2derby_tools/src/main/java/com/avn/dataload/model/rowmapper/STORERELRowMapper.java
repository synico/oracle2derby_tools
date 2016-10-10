package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREREL;

public class STORERELRowMapper<T> implements RowMapper<STOREREL> {

	@Override
	public STOREREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREREL obj = new STOREREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTRELTYP_ID(rs.getBigDecimal("STRELTYP_ID"));
		obj.setRELATEDSTORE_ID(rs.getBigDecimal("RELATEDSTORE_ID"));
		
		return obj;
	}

}
