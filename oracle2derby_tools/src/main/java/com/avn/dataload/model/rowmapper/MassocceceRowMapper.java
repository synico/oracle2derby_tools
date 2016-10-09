package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Massoccece;

public class MassocceceRowMapper<T> implements RowMapper<Massoccece> {

	@Override
	public Massoccece mapRow(ResultSet rs, int rowNum) throws SQLException {
		Massoccece obj = new Massoccece();
		
		obj.setOid(rs.getString("OID"));
		obj.setMassocceceId(rs.getBigDecimal("MASSOCCECE_ID"));
		obj.setMassoctypeId(rs.getString("MASSOCTYPE_ID"));
		obj.setCatentryIdFrom(rs.getBigDecimal("CATENTRY_ID_FROM"));
		obj.setCatentryIdTo(rs.getBigDecimal("CATENTRY_ID_TO"));
		obj.setQuantity(rs.getBigDecimal("QUANTITY"));
		obj.setRank(rs.getBigDecimal("RANK"));
		obj.setRule(rs.getString("RULE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setGroupname(rs.getString("GROUPNAME"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setMassocId(rs.getString("MASSOC_ID"));
		obj.setDate1(rs.getDate("DATE1"));
		
		return obj;
	}

}
