package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xmsg;

public class XmsgRowMapper<T> implements RowMapper<Xmsg> {

	@Override
	public Xmsg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xmsg obj = new Xmsg();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setXmsgId(rs.getBigDecimal("XMSG_ID"));
		obj.setEntityType(rs.getString("ENTITY_TYPE"));
		obj.setLastUpdate(rs.getDate("LAST_UPDATE"));
		obj.setEntityId(rs.getBigDecimal("ENTITY_ID"));
		
		return obj;
	}

}
