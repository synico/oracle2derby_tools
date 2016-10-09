package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlpromo;

public class EmlpromoRowMapper<T> implements RowMapper<Emlpromo> {

	@Override
	public Emlpromo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlpromo obj = new Emlpromo();
		
		obj.setName(rs.getString("NAME"));
		obj.setSccjobrefnum(rs.getBigDecimal("SCCJOBREFNUM"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setEmlpromoId(rs.getBigDecimal("EMLPROMO_ID"));
		obj.setEmlmsgId(rs.getBigDecimal("EMLMSG_ID"));
		obj.setModifiedby(rs.getString("MODIFIEDBY"));
		obj.setModdate(rs.getDate("MODDATE"));
		obj.setReplyto(rs.getString("REPLYTO"));
		
		return obj;
	}

}
