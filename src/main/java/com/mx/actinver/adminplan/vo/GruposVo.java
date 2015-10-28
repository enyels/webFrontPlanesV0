package com.mx.actinver.adminplan.vo;

import java.util.List;

public class GruposVo {

	private String grpId;
	private String grpName;
	private String grpDesc;
	private List<SubGruposVo> listSubGrupos;
	
	public String getGrpId() {
		return grpId;
	}
	public void setGrpId(String grpId) {
		this.grpId = grpId;
	}
	public String getGrpName() {
		return grpName;
	}
	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}
	public String getGrpDesc() {
		return grpDesc;
	}
	public void setGrpDesc(String grpDesc) {
		this.grpDesc = grpDesc;
	}
	public List<SubGruposVo> getListSubGrupos() {
		return listSubGrupos;
	}
	public void setListSubGrupos(List<SubGruposVo> listSubGrupos) {
		this.listSubGrupos = listSubGrupos;
	}
	
}
