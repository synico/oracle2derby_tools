package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xpcatentry;

public class XpcatentryRowMapper<T> implements RowMapper<Xpcatentry> {

	@Override
	public Xpcatentry mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xpcatentry obj = new Xpcatentry();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setField5(rs.getString("FIELD5"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setField6(rs.getString("FIELD6"));
		obj.setKitinclude(rs.getString("KITINCLUDE"));
		obj.setFamilyname(rs.getString("FAMILYNAME"));
		obj.setUnspsccode(rs.getString("UNSPSCCODE"));
		obj.setLeadfree(rs.getString("LEADFREE"));
		obj.setTopsellerflag(rs.getString("TOPSELLERFLAG"));
		obj.setProductapplications(rs.getString("PRODUCTAPPLICATIONS"));
		obj.setNewproductflag(rs.getString("NEWPRODUCTFLAG"));
		obj.setUnspscversioncode(rs.getString("UNSPSCVERSIONCODE"));
		obj.setGreencompliantflag(rs.getString("GREENCOMPLIANTFLAG"));
		obj.setMilitaryproductfl(rs.getString("MILITARYPRODUCTFL"));
		obj.setProductnumber(rs.getString("PRODUCTNUMBER"));
		
		return obj;
	}

}
