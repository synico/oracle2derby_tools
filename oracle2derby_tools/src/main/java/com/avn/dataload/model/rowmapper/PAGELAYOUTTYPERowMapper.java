package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAGELAYOUTTYPE;

public class PAGELAYOUTTYPERowMapper<T> implements RowMapper<PAGELAYOUTTYPE> {

    private static final Logger log = Logger.getLogger(PAGELAYOUTTYPERowMapper.class);

	@Override
	public PAGELAYOUTTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAGELAYOUTTYPE obj = new PAGELAYOUTTYPE();
		
		obj.setPAGELAYOUTTYPE_ID(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setISSTATIC(rs.getBigDecimal("ISSTATIC"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
