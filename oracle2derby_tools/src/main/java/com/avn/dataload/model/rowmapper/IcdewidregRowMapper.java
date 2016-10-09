package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Icdewidreg;

public class IcdewidregRowMapper<T> implements RowMapper<Icdewidreg> {

	@Override
	public Icdewidreg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Icdewidreg obj = new Icdewidreg();
		
		obj.setClassname(rs.getString("CLASSNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setOrderseq(rs.getBigDecimal("ORDERSEQ"));
		
		return obj;
	}

}
