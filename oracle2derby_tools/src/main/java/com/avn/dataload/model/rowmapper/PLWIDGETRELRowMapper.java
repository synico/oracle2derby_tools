package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGETREL;

public class PLWIDGETRELRowMapper<T> implements RowMapper<PLWIDGETREL> {

	@Override
	public PLWIDGETREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGETREL obj = new PLWIDGETREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setPLWIDGET_ID_PARENT(rs.getBigDecimal("PLWIDGET_ID_PARENT"));
		obj.setPLWIDGET_ID_CHILD(rs.getBigDecimal("PLWIDGET_ID_CHILD"));
		
		return obj;
	}

}
