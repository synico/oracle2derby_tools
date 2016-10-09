package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmemspotord;

public class DmemspotordRowMapper<T> implements RowMapper<Dmemspotord> {

	@Override
	public Dmemspotord mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmemspotord obj = new Dmemspotord();
		
		obj.setInterfacename(rs.getString("INTERFACENAME"));
		obj.setContenttype(rs.getString("CONTENTTYPE"));
		obj.setDmemspotordId(rs.getBigDecimal("DMEMSPOTORD_ID"));
		obj.setOrderingname(rs.getString("ORDERINGNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
