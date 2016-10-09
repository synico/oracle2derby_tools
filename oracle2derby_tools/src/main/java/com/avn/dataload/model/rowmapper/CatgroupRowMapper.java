package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catgroup;

public class CatgroupRowMapper<T> implements RowMapper<Catgroup> {

	@Override
	public Catgroup mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catgroup obj = new Catgroup();
		
		obj.setOid(rs.getString("OID"));
		obj.setRank(rs.getBigDecimal("RANK"));
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		obj.setDynamic(rs.getBigDecimal("DYNAMIC"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
