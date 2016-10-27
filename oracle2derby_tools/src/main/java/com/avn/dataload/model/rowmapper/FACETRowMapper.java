package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FACET;

public class FACETRowMapper<T> implements RowMapper<FACET> {

    private static final Logger log = Logger.getLogger(FACETRowMapper.class);

	@Override
	public FACET mapRow(ResultSet rs, int rowNum) throws SQLException {
		FACET obj = new FACET();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATTR_ID(rs.getBigDecimal("ATTR_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setZERO_DISPLAY(rs.getBigDecimal("ZERO_DISPLAY"));
		obj.setMAX_DISPLAY(rs.getBigDecimal("MAX_DISPLAY"));
		obj.setFACET_ID(rs.getBigDecimal("FACET_ID"));
		obj.setSELECTION(rs.getBigDecimal("SELECTION"));
		obj.setSORT_ORDER(rs.getBigDecimal("SORT_ORDER"));
		obj.setGROUP_ID(rs.getBigDecimal("GROUP_ID"));
		obj.setSRCHATTR_ID(rs.getBigDecimal("SRCHATTR_ID"));
		obj.setKEYWORD_SEARCH(rs.getBigDecimal("KEYWORD_SEARCH"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
