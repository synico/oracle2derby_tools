package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pltemplaterel;

public class PltemplaterelRowMapper<T> implements RowMapper<Pltemplaterel> {

	@Override
	public Pltemplaterel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pltemplaterel obj = new Pltemplaterel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPagelayoutId(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setTemplateId(rs.getBigDecimal("TEMPLATE_ID"));
		
		return obj;
	}

}
