package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECAT;

public class STORECATRowMapper<T> implements RowMapper<STORECAT> {

	@Override
	public STORECAT mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECAT obj = new STORECAT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setMASTERCATALOG(rs.getString("MASTERCATALOG"));
		
		return obj;
	}

}
