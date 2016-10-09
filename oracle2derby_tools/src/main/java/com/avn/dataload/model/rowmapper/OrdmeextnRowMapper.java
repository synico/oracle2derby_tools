package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordmeextn;

public class OrdmeextnRowMapper<T> implements RowMapper<Ordmeextn> {

	@Override
	public Ordmeextn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordmeextn obj = new Ordmeextn();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setRequestedshiptime(rs.getDate("REQUESTEDSHIPTIME"));
		obj.setBuyerorderid(rs.getString("BUYERORDERID"));
		obj.setRequestedtime(rs.getDate("REQUESTEDTIME"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setComments1(rs.getString("COMMENTS1"));
		obj.setComments2(rs.getString("COMMENTS2"));
		obj.setPayloadid(rs.getString("PAYLOADID"));
		obj.setOrdertype(rs.getString("ORDERTYPE"));
		
		return obj;
	}

}
