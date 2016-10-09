package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Blkrsndesc;

public class BlkrsndescRowMapper<T> implements RowMapper<Blkrsndesc> {

	@Override
	public Blkrsndesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Blkrsndesc obj = new Blkrsndesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
