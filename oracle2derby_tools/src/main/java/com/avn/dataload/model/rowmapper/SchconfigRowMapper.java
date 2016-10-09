package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Schconfig;

public class SchconfigRowMapper<T> implements RowMapper<Schconfig> {

	@Override
	public Schconfig mapRow(ResultSet rs, int rowNum) throws SQLException {
		Schconfig obj = new Schconfig();
		
		obj.setInterfacename(rs.getString("INTERFACENAME"));
		obj.setSccjobrefnum(rs.getBigDecimal("SCCJOBREFNUM"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSccrecdelay(rs.getBigDecimal("SCCRECDELAY"));
		obj.setSccpathinfo(rs.getString("SCCPATHINFO"));
		obj.setSccinterval(rs.getBigDecimal("SCCINTERVAL"));
		obj.setSccpriority(rs.getBigDecimal("SCCPRIORITY"));
		obj.setSccsequence(rs.getBigDecimal("SCCSEQUENCE"));
		obj.setScchost(rs.getString("SCCHOST"));
		obj.setSccrecatt(rs.getBigDecimal("SCCRECATT"));
		obj.setSccquery(rs.getString("SCCQUERY"));
		obj.setSccstart(rs.getDate("SCCSTART"));
		obj.setSccactive(rs.getString("SCCACTIVE"));
		obj.setSccapptype(rs.getString("SCCAPPTYPE"));
		
		return obj;
	}

}
