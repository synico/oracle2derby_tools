package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Invadjcode;

public class InvadjcodeRowMapper<T> implements RowMapper<Invadjcode> {

	@Override
	public Invadjcode mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invadjcode obj = new Invadjcode();
		
		obj.setInvadjcodeId(rs.getBigDecimal("INVADJCODE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setAdjustcode(rs.getString("ADJUSTCODE"));
		
		return obj;
	}

}
