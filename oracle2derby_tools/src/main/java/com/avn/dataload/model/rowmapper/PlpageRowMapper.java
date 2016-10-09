package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plpage;

public class PlpageRowMapper<T> implements RowMapper<Plpage> {

	@Override
	public Plpage mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plpage obj = new Plpage();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setPagelayouttypeId(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setAdminnameeditable(rs.getBigDecimal("ADMINNAMEEDITABLE"));
		obj.setUrlconfigurable(rs.getBigDecimal("URLCONFIGURABLE"));
		obj.setPlpageId(rs.getBigDecimal("PLPAGE_ID"));
		obj.setAdminname(rs.getString("ADMINNAME"));
		obj.setDeletable(rs.getBigDecimal("DELETABLE"));
		
		return obj;
	}

}
