package model;

public class ShowModel {
	private String corpnName;
	private String prinpal;
	private String licenceNo;
	private String type;
	private Long id;
	
    public String getType(){
    	return this.type;
    }
    public void setType(String type){
    	this.type=type;
    }
    public Long getId(){
    	return this.id;
    }
    public void setId(Long id){
    	this.id=id;
    }
    
	public String getCorpnName() {
		return corpnName;
	}
	public void setCorpnName(String corpnName) {
		this.corpnName = corpnName;
	}
	public String getPrinpal() {
		return prinpal;
	}
	public void setPrinpal(String principal) {
		this.prinpal = principal;
	}

	public String getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
}
