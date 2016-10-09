package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Collateral;

public class CollateralRowMapper<T> implements RowMapper<Collateral> {

	@Override
	public Collateral mapRow(ResultSet rs, int rowNum) throws SQLException {
		Collateral obj = new Collateral();
		
		obj.setName(rs.getString("NAME"));
		obj.setUrl(rs.getString("URL"));
		obj.setColltypeId(rs.getBigDecimal("COLLTYPE_ID"));
		obj.setBehavior(rs.getBigDecimal("BEHAVIOR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setCollateralId(rs.getBigDecimal("COLLATERAL_ID"));
		obj.setUidisplayable(rs.getBigDecimal("UIDISPLAYABLE"));
		obj.setManagingtool(rs.getBigDecimal("MANAGINGTOOL"));
		obj.setOvrmktlimit(rs.getBigDecimal("OVRMKTLIMIT"));
		
		return obj;
	}

}
