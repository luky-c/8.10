package model;

public class ShowModel {
	private String corpnName;
	private String prinpal;
	private String licenceNo;
	private String type;
	private String id;
	
	public ShowModel(){}
	public ShowModel(Boiler boiler){
		this.corpnName=boiler.getCorpnName();
		this.prinpal=boiler.getPrinpal();
		this.licenceNo=boiler.getLicenceNo();
		this.type=boiler.getType();
		this.id=boiler.getId();
		
	}
	public ShowModel(Crane crane){
		this.corpnName=crane.getCorpnName();
		this.prinpal=crane.getPrinpal();
		this.licenceNo=crane.getLicenceNo();
		this.type=crane.getType();
		this.id=crane.getId();
	}
	public ShowModel(Elevator elevator){
		this.corpnName=elevator.getCorpnName();
		this.prinpal=elevator.getPrinpal();
		this.licenceNo=elevator.getLicenceNo();
		this.type=elevator.getType();
		this.id=elevator.getId();
	}
	
    public String getType(){
    	return this.type;
    }
    public void setType(String type){
    	this.type=type;
    }
    public String getId(){
    	return this.id;
    }
    public void setId(String id){
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
