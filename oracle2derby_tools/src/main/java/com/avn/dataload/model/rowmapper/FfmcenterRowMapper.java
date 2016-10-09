package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ffmcenter;

public class FfmcenterRowMapper<T> implements RowMapper<Ffmcenter> {

	@Override
	public Ffmcenter mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ffmcenter obj = new Ffmcenter();
		
		obj.setName(rs.getString("NAME"));
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setDefaultshipoffset(rs.getBigDecimal("DEFAULTSHIPOFF"));
		obj.setExtffmstorenum(rs.getString("EXTFFMSTORENUM"));
		obj.setInventoryopflags(rs.getBigDecimal("INVENTORYOPFLAGS"));
		obj.setPickdelayinmin(rs.getBigDecimal("PICKDELAYINMIN"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setMaxnumpick(rs.getBigDecimal("MAXNUMPICK"));
		obj.setDropship(rs.getString("DROPSHIP"));
		
		return obj;
	}

}
