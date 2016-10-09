package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pattrvalue;

public class PattrvalueRowMapper<T> implements RowMapper<Pattrvalue> {

	@Override
	public Pattrvalue mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pattrvalue obj = new Pattrvalue();
		
		obj.setStringvalue(rs.getString("STRINGVALUE"));
		obj.setIntegervalue(rs.getBigDecimal("INTEGERVALUE"));
		obj.setAttrtypeId(rs.getString("ATTRTYPE_ID"));
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setFloatvalue(rs.getBigDecimal("FLOATVALUE"));
		obj.setOrderitemsId(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setMandatory(rs.getBigDecimal("MANDATORY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setCorrelationgroup(rs.getBigDecimal("CORRELATIONGROUP"));
		obj.setPattributeId(rs.getBigDecimal("PATTRIBUTE_ID"));
		obj.setEncryptflag(rs.getBigDecimal("ENCRYPTFLAG"));
		obj.setPattrvalueId(rs.getBigDecimal("PATTRVALUE_ID"));
		obj.setBigintvalue(rs.getBigDecimal("BIGINTVALUE"));
		obj.setAttachmentId(rs.getBigDecimal("ATTACHMENT_ID"));
		obj.setRfqrspprodId(rs.getBigDecimal("RFQRSPPROD_ID"));
		obj.setOperatorId(rs.getBigDecimal("OPERATOR_ID"));
		obj.setTermcondId(rs.getBigDecimal("TERMCOND_ID"));
		obj.setDatevalue(rs.getDate("DATEVALUE"));
		obj.setChangeable(rs.getBigDecimal("CHANGEABLE"));
		obj.setRfqprodId(rs.getBigDecimal("RFQPROD_ID"));
		
		return obj;
	}

}
