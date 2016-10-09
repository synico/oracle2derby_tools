package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pricerule;

public class PriceruleRowMapper<T> implements RowMapper<Pricerule> {

	@Override
	public Pricerule mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pricerule obj = new Pricerule();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setLastupdatetime(rs.getDate("LASTUPDATETIME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setType(rs.getBigDecimal("TYPE"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setPriceruleId(rs.getBigDecimal("PRICERULE_ID"));
		obj.setStarttime(rs.getDate("STARTTIME"));
		obj.setEndtime(rs.getDate("ENDTIME"));
		obj.setVersion(rs.getBigDecimal("VERSION"));
		obj.setCreatetime(rs.getDate("CREATETIME"));
		obj.setDependent(rs.getBigDecimal("DEPENDENT"));
		
		return obj;
	}

}
