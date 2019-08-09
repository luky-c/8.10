package model;

public class UniteCheckModel {
    private String id;
	private String type;
    private String inspection;
    private String content;
    private String result;
    private String corpnName;
    private String problem;
    private String problemResult;
    private int pageIndex;
    private int pageSize;
    
    public int getPageIndex(){
    	return this.pageIndex;
    }
    public int getPageSize(){
    	return this.pageSize;
    }
    public void setPageIndex(int pageIndex){
    	this.pageIndex=pageIndex;
    }
    public void setPageSize(int pageSize){
    	this.pageSize=pageSize;
    }
    
    public String getProblemResult(){
    	return this.problemResult;
    }
    public void setProblemResult(String ps){
    	this.problemResult = ps;
    }
    
    public String getId(){
    	return this.id;
    }
    public void setId(String id){
    	this.id=id;
    }
	public String getType() {
        return type;
    }

    public String getInspection() {
        return inspection;
    }

    public String getContent() {
        return content;
    }

    public String getResult() {
        return result;
    }

    public String getCorpnName() {
        return corpnName;
    }

    public String getProblem() {
        return problem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setInspection(String inspection) {
        this.inspection = inspection;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setCorpnName(String corpnName) {
        this.corpnName = corpnName;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }


}
