package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Versionspc;

public class VersionspcRowMapper<T> implements RowMapper<Versionspc> {

	@Override
	public Versionspc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Versionspc obj = new Versionspc();
		
		obj.setItemversnId(rs.getBigDecimal("ITEMVERSN_ID"));
		obj.setItemspcId(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setVersionspcId(rs.getBigDecimal("VERSIONSPC_ID"));
		
		return obj;
	}

}
