package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREPLTYPES;

public class STOREPLTYPESRowMapper<T> implements RowMapper<STOREPLTYPES> {

    private static final Logger log = Logger.getLogger(STOREPLTYPESRowMapper.class);

	@Override
	public STOREPLTYPES mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREPLTYPES obj = new STOREPLTYPES();
		
		obj.setPAGELAYOUTTYPE_ID(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setVIEWNAME(rs.getString("VIEWNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
