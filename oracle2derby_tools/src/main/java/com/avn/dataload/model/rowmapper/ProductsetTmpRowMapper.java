package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.ProductsetTmp;

public class ProductsetTmpRowMapper<T> implements RowMapper<ProductsetTmp> {

	@Override
	public ProductsetTmp mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsetTmp obj = new ProductsetTmp();
		
		obj.setName(rs.getString("NAME"));
		obj.setProductsetId(rs.getBigDecimal("PRODUCT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setPublishtime(rs.getDate("PUBLISHTIME"));
		obj.setXmldefinition(rs.getString("XMLDEFINITION"));
		obj.setTheStatic(rs.getString("THE_STATIC"));
		
		return obj;
	}

}
