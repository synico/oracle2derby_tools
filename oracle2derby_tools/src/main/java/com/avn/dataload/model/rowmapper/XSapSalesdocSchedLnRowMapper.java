package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XSapSalesdocSchedLn;

public class XSapSalesdocSchedLnRowMapper<T> implements RowMapper<XSapSalesdocSchedLn> {

	@Override
	public XSapSalesdocSchedLn mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSapSalesdocSchedLn obj = new XSapSalesdocSchedLn();
		
		obj.setReqDate(rs.getDate("REQ_DATE"));
		obj.setAtpDate(rs.getDate("ATP_DATE"));
		obj.setVbepWmeng(rs.getBigDecimal("VBEP_WMENG"));
		obj.setVbepBmeng(rs.getBigDecimal("VBEP_BMENG"));
		obj.setuAtpQty(rs.getBigDecimal("U_ATP_QTY"));
		obj.setUpdatedFlag(rs.getString("UPDATED_FLAG"));
		obj.setuUnshippedQty(rs.getBigDecimal("U_UNSHIPPED_QTY"));
		
		return obj;
	}

}
