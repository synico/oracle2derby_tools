package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Itemspc;

public class ItemspcRowMapper<T> implements RowMapper<Itemspc> {

	@Override
	public Itemspc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Itemspc obj = new Itemspc();
		
		obj.setBaseitemId(rs.getBigDecimal("BASEITEM_ID"));
		obj.setPartnumber(rs.getString("PARTNUMBER"));
		obj.setDiscontinued(rs.getString("DISCONTINUED"));
		obj.setItemspcId(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
