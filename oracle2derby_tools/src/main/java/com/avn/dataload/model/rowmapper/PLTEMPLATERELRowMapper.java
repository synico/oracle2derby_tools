package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLTEMPLATEREL;

public class PLTEMPLATERELRowMapper<T> implements RowMapper<PLTEMPLATEREL> {

    private static final Logger log = Logger.getLogger(PLTEMPLATERELRowMapper.class);

	@Override
	public PLTEMPLATEREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLTEMPLATEREL obj = new PLTEMPLATEREL();
		
		obj.setPAGELAYOUT_ID(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTEMPLATE_ID(rs.getBigDecimal("TEMPLATE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
