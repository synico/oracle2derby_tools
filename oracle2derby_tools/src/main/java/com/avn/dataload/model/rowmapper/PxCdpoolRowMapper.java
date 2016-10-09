package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxCdpool;

public class PxCdpoolRowMapper<T> implements RowMapper<PxCdpool> {

	@Override
	public PxCdpool mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxCdpool obj = new PxCdpool();
		
		obj.setWorkspace(rs.getString("WORKSPACE"));
		obj.setCode(rs.getString("CODE"));
		obj.setReferenceId(rs.getBigDecimal("REFERENCE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setTransferable(rs.getBigDecimal("TRANSFERABLE"));
		obj.setPxCdpoolId(rs.getBigDecimal("PX_CDPOOL_ID"));
		obj.setValidfrom(rs.getDate("VALIDFROM"));
		obj.setValiduntil(rs.getDate("VALIDUNTIL"));
		obj.setInternalId(rs.getBigDecimal("INTERNAL_ID"));
		obj.setTaskgroup(rs.getString("TASKGROUP"));
		obj.setUsagetype(rs.getBigDecimal("USAGETYPE"));
		
		return obj;
	}

}
