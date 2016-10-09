package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordimeextn;

public class OrdimeextnRowMapper<T> implements RowMapper<Ordimeextn> {

	@Override
	public Ordimeextn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordimeextn obj = new Ordimeextn();
		
		obj.setOrderitemsId(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setShipascomplete(rs.getString("SHIPASCOMPLETE"));
		obj.setRequestedshiptime(rs.getDate("REQUESTEDSHIPTIME"));
		obj.setComments1(rs.getString("COMMENTS1"));
		obj.setComments2(rs.getString("COMMENTS2"));
		
		return obj;
	}

}
