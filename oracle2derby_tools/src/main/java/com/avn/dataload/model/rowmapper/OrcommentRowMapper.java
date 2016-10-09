package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Orcomment;

public class OrcommentRowMapper<T> implements RowMapper<Orcomment> {

	@Override
	public Orcomment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Orcomment obj = new Orcomment();
		
		obj.setBuschnId(rs.getBigDecimal("BUSCHN_ID"));
		obj.setOrcommentId(rs.getBigDecimal("ORCOMMENT_ID"));
		obj.setOrdchgrsnId(rs.getBigDecimal("ORDCHGRSN_ID"));
		obj.setServicerepId(rs.getBigDecimal("SERVICEREP_ID"));
		obj.setOrderversion(rs.getBigDecimal("ORDERVERSION"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setComments(rs.getString("COMMENTS"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getDate("FIELD3"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
