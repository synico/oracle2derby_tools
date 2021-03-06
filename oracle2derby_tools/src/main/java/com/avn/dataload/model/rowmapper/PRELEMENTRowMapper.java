package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRELEMENT;

public class PRELEMENTRowMapper<T> implements RowMapper<PRELEMENT> {

    private static final Logger log = Logger.getLogger(PRELEMENTRowMapper.class);

	@Override
	public PRELEMENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRELEMENT obj = new PRELEMENT();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setPRELEMENT_ID(rs.getBigDecimal("PRELEMENT_ID"));
		obj.setPRELETEMPLATE_ID(rs.getBigDecimal("PRELETEMPLATE_ID"));
		obj.setPRICERULE_ID(rs.getBigDecimal("PRICERULE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setPARENT(rs.getString("PARENT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
