package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Itemversn;

public class ItemversnRowMapper<T> implements RowMapper<Itemversn> {

	@Override
	public Itemversn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Itemversn obj = new Itemversn();
		
		obj.setBaseitemId(rs.getBigDecimal("BASEITEM_ID"));
		obj.setItemversnId(rs.getBigDecimal("ITEMVERSN_ID"));
		obj.setExpirationdate(rs.getDate("EXPIRATIONDATE"));
		obj.setVersionname(rs.getString("VERSIONNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		
		return obj;
	}

}
