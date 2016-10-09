package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.BusauditWithBLOBs;

public class BusauditWithBLOBsRowMapper<T> implements RowMapper<BusauditWithBLOBs> {

	@Override
	public BusauditWithBLOBs mapRow(ResultSet rs, int rowNum) throws SQLException {
		BusauditWithBLOBs obj = new BusauditWithBLOBs();
		
		obj.setSignature(rs.getbyte[]("SIGNATURE"));
		obj.setParameters(rs.getString("PARAMETERS"));
		
		return obj;
	}

}
