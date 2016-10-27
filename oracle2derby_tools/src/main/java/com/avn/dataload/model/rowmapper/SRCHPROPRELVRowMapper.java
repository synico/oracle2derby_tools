package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHPROPRELV;

public class SRCHPROPRELVRowMapper<T> implements RowMapper<SRCHPROPRELV> {

    private static final Logger log = Logger.getLogger(SRCHPROPRELVRowMapper.class);

	@Override
	public SRCHPROPRELV mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHPROPRELV obj = new SRCHPROPRELV();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setRELVALUE(rs.getBigDecimal("RELVALUE"));
		obj.setINDEXFIELD(rs.getString("INDEXFIELD"));
		obj.setSRCHPROPRELV_ID(rs.getBigDecimal("SRCHPROPRELV_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
