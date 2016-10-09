package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Transport;

public class TransportRowMapper<T> implements RowMapper<Transport> {

	@Override
	public Transport mapRow(ResultSet rs, int rowNum) throws SQLException {
		Transport obj = new Transport();
		
		obj.setName(rs.getString("NAME"));
		obj.setCode(rs.getString("CODE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setImplemented(rs.getString("IMPLEMENTED"));
		obj.setAddressable(rs.getString("ADDRESSABLE"));
		obj.setTimeout(rs.getBigDecimal("TIMEOUT"));
		obj.setTransportId(rs.getBigDecimal("TRANSPORT_ID"));
		
		return obj;
	}

}
