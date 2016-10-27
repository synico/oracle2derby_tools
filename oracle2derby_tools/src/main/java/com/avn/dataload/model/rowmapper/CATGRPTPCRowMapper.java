package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATGRPTPC;

public class CATGRPTPCRowMapper<T> implements RowMapper<CATGRPTPC> {

    private static final Logger log = Logger.getLogger(CATGRPTPCRowMapper.class);

	@Override
	public CATGRPTPC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATGRPTPC obj = new CATGRPTPC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setTRADEPOSCN_ID(rs.getBigDecimal("TRADEPOSCN_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
