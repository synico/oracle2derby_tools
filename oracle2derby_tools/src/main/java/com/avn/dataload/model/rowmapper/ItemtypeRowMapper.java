package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Itemtype;

public class ItemtypeRowMapper<T> implements RowMapper<Itemtype> {

	@Override
	public Itemtype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Itemtype obj = new Itemtype();
		
		obj.setOid(rs.getString("OID"));
		obj.setItemtypeId(rs.getString("ITEMTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
