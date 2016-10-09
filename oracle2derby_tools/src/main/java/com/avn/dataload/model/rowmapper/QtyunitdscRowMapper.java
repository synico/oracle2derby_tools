package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Qtyunitdsc;

public class QtyunitdscRowMapper<T> implements RowMapper<Qtyunitdsc> {

	@Override
	public Qtyunitdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Qtyunitdsc obj = new Qtyunitdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
