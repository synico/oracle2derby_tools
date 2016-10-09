package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pagelayout;

public class PagelayoutRowMapper<T> implements RowMapper<Pagelayout> {

	@Override
	public Pagelayout mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pagelayout obj = new Pagelayout();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setName(rs.getString("NAME"));
		obj.setStartdate(rs.getDate("STARTDATE"));
		obj.setEnddate(rs.getDate("ENDDATE"));
		obj.setThumbnail(rs.getString("THUMBNAIL"));
		obj.setFullimage(rs.getString("FULLIMAGE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setPagelayoutId(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setPagelayouttypeId(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setMastercss(rs.getString("MASTERCSS"));
		obj.setDevicetype(rs.getString("DEVICETYPE"));
		obj.setIstemplate(rs.getBigDecimal("ISTEMPLATE"));
		obj.setCreatedate(rs.getDate("CREATEDATE"));
		obj.setIsdefault(rs.getBigDecimal("ISDEFAULT"));
		obj.setViewname(rs.getString("VIEWNAME"));
		
		return obj;
	}

}
