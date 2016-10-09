package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Offer;

public class OfferRowMapper<T> implements RowMapper<Offer> {

	@Override
	public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Offer obj = new Offer();
		
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setOid(rs.getString("OID"));
		obj.setPublished(rs.getBigDecimal("PUBLISHED"));
		obj.setStartdate(rs.getDate("STARTDATE"));
		obj.setEnddate(rs.getDate("ENDDATE"));
		obj.setFlags(rs.getBigDecimal("FLAGS"));
		obj.setPrecedence(rs.getBigDecimal("PRECEDENCE"));
		obj.setTradeposcnId(rs.getBigDecimal("TRADEPOSCN_ID"));
		obj.setMinimumquantity(rs.getBigDecimal("MINIMUMQUANTITY"));
		obj.setMaximumquantity(rs.getBigDecimal("MAXIMUMQUANTITY"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setIdentifier(rs.getBigDecimal("IDENTIFIER"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setOfferId(rs.getBigDecimal("OFFER_ID"));
		
		return obj;
	}

}
