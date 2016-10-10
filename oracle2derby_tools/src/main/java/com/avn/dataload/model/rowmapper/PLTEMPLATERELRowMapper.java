package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLTEMPLATEREL;

public class PLTEMPLATERELRowMapper<T> implements RowMapper<PLTEMPLATEREL> {

	@Override
	public PLTEMPLATEREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLTEMPLATEREL obj = new PLTEMPLATEREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPAGELAYOUT_ID(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setTEMPLATE_ID(rs.getBigDecimal("TEMPLATE_ID"));
		
		return obj;
	}

}
