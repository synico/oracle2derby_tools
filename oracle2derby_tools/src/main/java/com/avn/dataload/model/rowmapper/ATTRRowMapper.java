package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTR;

public class ATTRRowMapper<T> implements RowMapper<ATTR> {

    private static final Logger log = Logger.getLogger(ATTRRowMapper.class);

	@Override
	public ATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTR obj = new ATTR();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATTR_ID(rs.getBigDecimal("ATTR_ID"));
		obj.setSEARCHABLE(rs.getBigDecimal("SEARCHABLE"));
		obj.setCOMPARABLE(rs.getBigDecimal("COMPARABLE"));
		obj.setATTRUSAGE(rs.getBigDecimal("ATTRUSAGE"));
		obj.setFACETABLE(rs.getBigDecimal("FACETABLE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
//		obj.setATTRDICT_ID(rs.getBigDecimal("ATTRDICT_ID"));
		obj.setATTRDICT_ID(new java.math.BigDecimal(10001));//TODO load from avu93db to mall_infosys
		obj.setDISPLAYABLE(rs.getBigDecimal("DISPLAYABLE"));
		obj.setSTOREDISPLAY(rs.getBigDecimal("STOREDISPLAY"));
		obj.setMERCHANDISABLE(rs.getBigDecimal("MERCHANDISABLE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
