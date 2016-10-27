package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_DESCRIPTION;

public class PX_DESCRIPTIONRowMapper<T> implements RowMapper<PX_DESCRIPTION> {

    private static final Logger log = Logger.getLogger(PX_DESCRIPTIONRowMapper.class);

	@Override
	public PX_DESCRIPTION mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_DESCRIPTION obj = new PX_DESCRIPTION();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setFIELD5(rs.getString("FIELD5"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setPX_PROMOTION_ID(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setADMINDESC(rs.getString("ADMINDESC"));
		obj.setSHORTDESC(rs.getString("SHORTDESC"));
		obj.setLONGDESC(rs.getString("LONGDESC"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
