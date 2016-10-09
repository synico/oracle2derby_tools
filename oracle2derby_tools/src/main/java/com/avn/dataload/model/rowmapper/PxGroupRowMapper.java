package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxGroup;

public class PxGroupRowMapper<T> implements RowMapper<PxGroup> {

	@Override
	public PxGroup mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxGroup obj = new PxGroup();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setGrpname(rs.getString("GRPNAME"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setPxGroupId(rs.getBigDecimal("PX_GROUP_ID"));
		obj.setXmlparam(rs.getString("XMLPARAM"));
		
		return obj;
	}

}
