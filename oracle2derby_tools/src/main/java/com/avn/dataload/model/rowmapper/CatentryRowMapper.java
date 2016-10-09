package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catentry;

public class CatentryRowMapper<T> implements RowMapper<Catentry> {

	@Override
	public Catentry mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catentry obj = new Catentry();
		
		obj.setState(rs.getString("STATE"));
		obj.setField4(rs.getString("FIELD4"));
		obj.setOid(rs.getString("OID"));
		obj.setBaseitemId(rs.getBigDecimal("BASEITEM_ID"));
		obj.setPartnumber(rs.getString("PARTNUMBER"));
		obj.setStartdate(rs.getDate("STARTDATE"));
		obj.setEnddate(rs.getDate("ENDDATE"));
		obj.setAvailabilitydate(rs.getDate("AVAILABILITYDATE"));
		obj.setCatenttypeId(rs.getString("CATENTTYPE_ID"));
		obj.setMfpartnumber(rs.getString("MFPARTNUMBER"));
		obj.setLastorderdate(rs.getDate("LASTORDERDATE"));
		obj.setEndofservicedate(rs.getDate("ENDOFSERVICEDATE"));
		obj.setDiscontinuedate(rs.getDate("DISCONTINUEDATE"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setItemspcId(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setMfname(rs.getString("MFNAME"));
		obj.setUrl(rs.getString("URL"));
		obj.setOnspecial(rs.getBigDecimal("ONSPECIAL"));
		obj.setOnauction(rs.getBigDecimal("ONAUCTION"));
		obj.setField5(rs.getString("FIELD5"));
		obj.setBuyable(rs.getBigDecimal("BUYABLE"));
		obj.setRank(rs.getBigDecimal("RANK"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
