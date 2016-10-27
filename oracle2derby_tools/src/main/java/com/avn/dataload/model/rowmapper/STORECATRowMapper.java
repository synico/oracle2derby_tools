package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECAT;

public class STORECATRowMapper<T> implements RowMapper<STORECAT> {

    private static final Logger log = Logger.getLogger(STORECATRowMapper.class);

	@Override
	public STORECAT mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECAT obj = new STORECAT();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setMASTERCATALOG(rs.getString("MASTERCATALOG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
