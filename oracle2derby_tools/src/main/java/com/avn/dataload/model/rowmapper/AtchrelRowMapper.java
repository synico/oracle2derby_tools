package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Atchrel;

public class AtchrelRowMapper<T> implements RowMapper<Atchrel> {

	@Override
	public Atchrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Atchrel obj = new Atchrel();
		
		obj.setAtchobjtypId(rs.getBigDecimal("ATCHOBJTYP_ID"));
		obj.setBigintobjectId(rs.getBigDecimal("BIGINTOBJECT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAtchtgtId(rs.getBigDecimal("ATCHTGT_ID"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setAtchrelId(rs.getBigDecimal("ATCHREL_ID"));
		obj.setObjectId(rs.getString("OBJECT_ID"));
		obj.setAtchrlusId(rs.getBigDecimal("ATCHRLUS_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		
		return obj;
	}

}
