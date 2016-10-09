package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pagelayouttype;

public class PagelayouttypeRowMapper<T> implements RowMapper<Pagelayouttype> {

	@Override
	public Pagelayouttype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pagelayouttype obj = new Pagelayouttype();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPagelayouttypeId(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setIsstatic(rs.getBigDecimal("ISSTATIC"));
		
		return obj;
	}

}
