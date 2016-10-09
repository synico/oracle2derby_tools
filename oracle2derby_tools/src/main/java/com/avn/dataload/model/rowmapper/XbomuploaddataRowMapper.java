package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xbomuploaddata;

public class XbomuploaddataRowMapper<T> implements RowMapper<Xbomuploaddata> {

	@Override
	public Xbomuploaddata mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xbomuploaddata obj = new Xbomuploaddata();
		
		obj.setPartnumber(rs.getString("PARTNUMBER"));
		obj.setQuantity(rs.getBigDecimal("QUANTITY"));
		obj.setMfname(rs.getString("MFNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStatus(rs.getString("STATUS"));
		obj.setXbomuploadid(rs.getBigDecimal("XBOMUPLOADID"));
		obj.setCreateddate(rs.getDate("CREATEDDATE"));
		obj.setXbomuploaddataid(rs.getBigDecimal("XBOMUPLOADDATAID"));
		obj.setCustomerpartnumber(rs.getString("CUSTOMERPARTNUMBER"));
		obj.setRowcounter(rs.getBigDecimal("ROWCOUNTER"));
		
		return obj;
	}

}
