package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Store;

public class StoreRowMapper<T> implements RowMapper<Store> {

	@Override
	public Store mapRow(ResultSet rs, int rowNum) throws SQLException {
		Store obj = new Store();
		
		obj.setOid(rs.getString("OID"));
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setStorecgryId(rs.getBigDecimal("STORECGRY_ID"));
		obj.setQuotegoodfor(rs.getBigDecimal("QUOTEGOODFOR"));
		obj.setAllocationgoodfor(rs.getBigDecimal("ALLOCATIONGOODFOR"));
		obj.setMaxbooffset(rs.getBigDecimal("MAXBOOFF"));
		obj.setRejectedordexpiry(rs.getBigDecimal("REJECTEDORDEXPIRY"));
		obj.setFfmcselectionflags(rs.getBigDecimal("FFMCSELECTIONFLAGS"));
		obj.setBopmpadfactor(rs.getBigDecimal("BOPMPADFACTOR"));
		obj.setRtnffmctrId(rs.getBigDecimal("RTNFFMCTR_ID"));
		obj.setDefaultbooffset(rs.getBigDecimal("DEFAULTBOOFF"));
		obj.setPricerefflags(rs.getBigDecimal("PRICEREFFLAGS"));
		obj.setAvsacceptcodes(rs.getString("AVSACCEPTCODES"));
		obj.setCrtdbycntrId(rs.getBigDecimal("CRTDBYCNTR_ID"));
		obj.setLastupdatestatus(rs.getDate("LASTUPDATESTATUS"));
		obj.setAllocationoffset(rs.getBigDecimal("ALLOCATIONOFF"));
		obj.setMaxfooffset(rs.getBigDecimal("MAXFOOFF"));
		obj.setInventoryopflag(rs.getBigDecimal("INVENTORYOPFLAG"));
		obj.setBlockingactive(rs.getBigDecimal("BLOCKINGACTIVE"));
		obj.setBlkextasynch(rs.getBigDecimal("BLKEXTASYNCH"));
		obj.setPersistentsession(rs.getBigDecimal("PERSISTENTSESSION"));
		obj.setOrderhistactive(rs.getString("ORDERHISTACTIVE"));
		obj.setInventorysystem(rs.getBigDecimal("INVENTORYSYSTEM"));
		obj.setStoregrpId(rs.getBigDecimal("STOREGRP_ID"));
		obj.setStorelevel(rs.getString("STORELEVEL"));
		obj.setDirectory(rs.getString("DIRECTORY"));
		obj.setStoretype(rs.getString("STORETYPE"));
		obj.setRmagoodfor(rs.getBigDecimal("RMAGOODFOR"));
		
		return obj;
	}

}
