package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Chkcmd;

public class ChkcmdRowMapper<T> implements RowMapper<Chkcmd> {

	@Override
	public Chkcmd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Chkcmd obj = new Chkcmd();
		
		obj.setInterfacename(rs.getString("INTERFACENAME"));
		obj.setChkcmdId(rs.getBigDecimal("CHKCMD_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		
		return obj;
	}

}
