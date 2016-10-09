package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmemspotcolldef;

public class DmemspotcolldefRowMapper<T> implements RowMapper<Dmemspotcolldef> {

	@Override
	public Dmemspotcolldef mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmemspotcolldef obj = new Dmemspotcolldef();
		
		obj.setDmemspotcolldefId(rs.getBigDecimal("DMEMSPOTCOLLDEF_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setEmspotId(rs.getBigDecimal("EMSPOT_ID"));
		obj.setCollateralId(rs.getBigDecimal("COLLATERAL_ID"));
		
		return obj;
	}

}
