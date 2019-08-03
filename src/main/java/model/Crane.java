package model;
/*
 *起重机械制造单位监督抽查记录表(2019版)
 */

public class Crane{
    private String id;
    private String type;
    /*
     *表头
     */
    private String corpnName;//单位名称
    private String address;//制造地址
    private String prinpal;//单位负责人
    private long phoneNo;//联系电话
    private Long licenceNo;//许可证编号
    private long fax;//传真
    private String licenceDate;//许可证有效期
    private String licenceRange;//许可的范围
    
    /*
     *资源条件及管理
     */
    private String problem_1_1;// 资源管理(Resource Management)1.1 问题说明及记录
    private String result_1_1;// 资源管理(Resource Management)1.1 检查结果

    private String problem_1_2;// 1.2 问题说明及记录
    private String result_1_2;// 1.2 检查结果
    
    private String problem_1_3;// 1.3 问题说明及记录
    private String result_1_3;// 1.3 检查结果
    
    private String problem_1_4;// 1.4 问题说明及记录
    private String result_1_4;// 1.4 检查结果
    
    private String problem_1_5;// 1.5 问题说明及记录
    private String result_1_5;// 1.5 检查结果
    
    private String problem_1_6;// 1.6 问题说明及记录
    private String result_1_6;// 1.6 检查结果
    
    private String problem_1_7;// 1.7 问题说明及记录
    private String result_1_7;// 1.7 检查结果
    
    private String problem_1_8;// 1.8 问题说明及记录
    private String result_1_8;// 1.8 检查结果
    
    private String problem_1_9;// 1.9 问题说明及记录
    private String result_1_9;// 1.9 检查结果
    
    private String problem_1_10;// 1.10 问题说明及记录
    private String result_1_10;// 1.10 检查结果
    
    private String problem_1_11;// 1.11 问题说明及记录
    private String result_1_11;// 1.11 检查结果
    
    private String problem_1_12;// 1.12 问题说明及记录
    private String result_1_12;// 1.12 检查结果
    
    /*
     *补充
     */
    private String problem_1;//问题1 问题记录(包括未在“检查内容”栏目中列出的其他项目及其问题)
    private String checker_1;//问题1 监督检查人员
    private String checkDate_1;//问题1 检查日期
    
    /*
     *产品质量及控制
     *
     *
     *抽查产品A
     */
    private String productNameA;//设备名称（品种）
    private String productTypeA;//型号
    private String productNoA;//出厂编号
    private String productDateA;//出厂日期
    
    /*
     *抽查产品B
     */
    private String productNameB;//设备名称（品种）
    private String productTypeB;//型号
    private String productNoB;//出厂编号
    private String productDateB;//出厂日期
    
    /*
     *抽查产品C
     */
    private String productNameC;//设备名称（品种）
    private String productTypeC;//型号
    private String productNoC;//出厂编号
    private String productDateC;//出厂日期
    
    /*
     *抽查产品D
     */
    private String productNameD;//设备名称（品种）
    private String productTypeD;//型号
    private String productNoD;//出厂编号
    private String productDateD;//出厂日期
    
    
    private String problem_2_1;//检查项目(Check item) 2.1 问题说明及记录
    private String result_2_1;//检查项目(Check item) 2.1 结果
    
    private String problem_2_2;//2.2 问题说明及记录
    private String result_2_2;//2.2 结果
    
    private String problem_2_3;//2.3 问题说明及记录
    private String result_2_3;//2.3 结果
    
    private String problem_2_4;//2.4 问题说明及记录
    private String result_2_4;//2.4 结果
    
    private String problem_2_5;//2.5 问题说明及记录
    private String result_2_5;//2.5 结果
    
    private String problem_2_6;//2.6 问题说明及记录
    private String result_2_6;//2.6 结果
    
    private String problem_2_7;//2.7 问题说明及记录
    private String result_2_7;//2.7 结果
    
    private String problem_2_8;//2.8 问题说明及记录
    private String result_2_8;//2.8 结果
    
    private String problem_2_9;//2.9 问题说明及记录
    private String result_2_9;//2.9 结果
    
    private String problem_2_10;//2.10 问题说明及记录
    private String result_2_10;//2.10 结果

    /*
     *补充
     */
    private String problem_2;//问题2 问题记录(包括未在“检查内容”栏目中列出的其他项目及其问题)
    //private String c;//问题2 
    private String checker_2;//监督检查人员
    private String checkDate_2;//问题2 检查日期
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrinpal() {
		return prinpal;
	}
	public void setPrinpal(String prinpal) {
		this.prinpal = prinpal;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Long getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(Long licenceNo) {
		this.licenceNo = licenceNo;
	}
	public long getFax() {
		return fax;
	}
	public void setFax(long fax) {
		this.fax = fax;
	}
	public String getLicenceDate() {
		return licenceDate;
	}
	public void setLicenceDate(String licenceDate) {
		this.licenceDate = licenceDate;
	}
	public String getLicenceRange() {
		return licenceRange;
	}
	public void setLicenceRange(String licenceRange) {
		this.licenceRange = licenceRange;
	}
	public String getProblem_1_1() {
		return problem_1_1;
	}
	public void setProblem_1_1(String problem_1_1) {
		this.problem_1_1 = problem_1_1;
	}
	public String getResult_1_1() {
		return result_1_1;
	}
	public void setResult_1_1(String result_1_1) {
		this.result_1_1 = result_1_1;
	}
	public String getProblem_1_2() {
		return problem_1_2;
	}
	public void setProblem_1_2(String problem_1_2) {
		this.problem_1_2 = problem_1_2;
	}
	public String getResult_1_2() {
		return result_1_2;
	}
	public void setResult_1_2(String result_1_2) {
		this.result_1_2 = result_1_2;
	}
	public String getProblem_1_3() {
		return problem_1_3;
	}
	public void setProblem_1_3(String problem_1_3) {
		this.problem_1_3 = problem_1_3;
	}
	public String getResult_1_3() {
		return result_1_3;
	}
	public void setResult_1_3(String result_1_3) {
		this.result_1_3 = result_1_3;
	}
	public String getProblem_1_4() {
		return problem_1_4;
	}
	public void setProblem_1_4(String problem_1_4) {
		this.problem_1_4 = problem_1_4;
	}
	public String getResult_1_4() {
		return result_1_4;
	}
	public void setResult_1_4(String result_1_4) {
		this.result_1_4 = result_1_4;
	}
	public String getProblem_1_5() {
		return problem_1_5;
	}
	public void setProblem_1_5(String problem_1_5) {
		this.problem_1_5 = problem_1_5;
	}
	public String getResult_1_5() {
		return result_1_5;
	}
	public void setResult_1_5(String result_1_5) {
		this.result_1_5 = result_1_5;
	}
	public String getProblem_1_6() {
		return problem_1_6;
	}
	public void setProblem_1_6(String problem_1_6) {
		this.problem_1_6 = problem_1_6;
	}
	public String getResult_1_6() {
		return result_1_6;
	}
	public void setResult_1_6(String result_1_6) {
		this.result_1_6 = result_1_6;
	}
	public String getProblem_1_7() {
		return problem_1_7;
	}
	public void setProblem_1_7(String problem_1_7) {
		this.problem_1_7 = problem_1_7;
	}
	public String getResult_1_7() {
		return result_1_7;
	}
	public void setResult_1_7(String result_1_7) {
		this.result_1_7 = result_1_7;
	}
	public String getProblem_1_8() {
		return problem_1_8;
	}
	public void setProblem_1_8(String problem_1_8) {
		this.problem_1_8 = problem_1_8;
	}
	public String getResult_1_8() {
		return result_1_8;
	}
	public void setResult_1_8(String result_1_8) {
		this.result_1_8 = result_1_8;
	}
	public String getProblem_1_9() {
		return problem_1_9;
	}
	public void setProblem_1_9(String problem_1_9) {
		this.problem_1_9 = problem_1_9;
	}
	public String getResult_1_9() {
		return result_1_9;
	}
	public void setResult_1_9(String result_1_9) {
		this.result_1_9 = result_1_9;
	}
	public String getProblem_1_10() {
		return problem_1_10;
	}
	public void setProblem_1_10(String problem_1_10) {
		this.problem_1_10 = problem_1_10;
	}
	public String getResult_1_10() {
		return result_1_10;
	}
	public void setResult_1_10(String result_1_10) {
		this.result_1_10 = result_1_10;
	}
	public String getProblem_1_11() {
		return problem_1_11;
	}
	public void setProblem_1_11(String problem_1_11) {
		this.problem_1_11 = problem_1_11;
	}
	public String getResult_1_11() {
		return result_1_11;
	}
	public void setResult_1_11(String result_1_11) {
		this.result_1_11 = result_1_11;
	}
	public String getProblem_1_12() {
		return problem_1_12;
	}
	public void setProblem_1_12(String problem_1_12) {
		this.problem_1_12 = problem_1_12;
	}
	public String getResult_1_12() {
		return result_1_12;
	}
	public void setResult_1_12(String result_1_12) {
		this.result_1_12 = result_1_12;
	}
	public String getProblem_1() {
		return problem_1;
	}
	public void setProblem_1(String problem_1) {
		this.problem_1 = problem_1;
	}
	public String getChecker_1() {
		return checker_1;
	}
	public void setChecker_1(String checker_1) {
		this.checker_1 = checker_1;
	}
	public String getCheckDate_1() {
		return checkDate_1;
	}
	public void setCheckDate_1(String checkDate_1) {
		this.checkDate_1 = checkDate_1;
	}
	public String getProductNameA() {
		return productNameA;
	}
	public void setProductNameA(String productNameA) {
		this.productNameA = productNameA;
	}
	public String getProductTypeA() {
		return productTypeA;
	}
	public void setProductTypeA(String productTypeA) {
		this.productTypeA = productTypeA;
	}
	public String getProductNoA() {
		return productNoA;
	}
	public void setProductNoA(String productNoA) {
		this.productNoA = productNoA;
	}
	public String getProductDateA() {
		return productDateA;
	}
	public void setProductDateA(String productDateA) {
		this.productDateA = productDateA;
	}
	public String getProductNameB() {
		return productNameB;
	}
	public void setProductNameB(String productNameB) {
		this.productNameB = productNameB;
	}
	public String getProductTypeB() {
		return productTypeB;
	}
	public void setProductTypeB(String productTypeB) {
		this.productTypeB = productTypeB;
	}
	public String getProductNoB() {
		return productNoB;
	}
	public void setProductNoB(String productNoB) {
		this.productNoB = productNoB;
	}
	public String getProductDateB() {
		return productDateB;
	}
	public void setProductDateB(String productDateB) {
		this.productDateB = productDateB;
	}
	public String getProductNameC() {
		return productNameC;
	}
	public void setProductNameC(String productNameC) {
		this.productNameC = productNameC;
	}
	public String getProductTypeC() {
		return productTypeC;
	}
	public void setProductTypeC(String productTypeC) {
		this.productTypeC = productTypeC;
	}
	public String getProductNoC() {
		return productNoC;
	}
	public void setProductNoC(String productNoC) {
		this.productNoC = productNoC;
	}
	public String getProductDateC() {
		return productDateC;
	}
	public void setProductDateC(String productDateC) {
		this.productDateC = productDateC;
	}
	public String getProductNameD() {
		return productNameD;
	}
	public void setProductNameD(String productNameD) {
		this.productNameD = productNameD;
	}
	public String getProductTypeD() {
		return productTypeD;
	}
	public void setProductTypeD(String productTypeD) {
		this.productTypeD = productTypeD;
	}
	public String getProductNoD() {
		return productNoD;
	}
	public void setProductNoD(String productNoD) {
		this.productNoD = productNoD;
	}
	public String getProductDateD() {
		return productDateD;
	}
	public void setProductDateD(String productDateD) {
		this.productDateD = productDateD;
	}
	public String getProblem_2_1() {
		return problem_2_1;
	}
	public void setProblem_2_1(String problem_2_1) {
		this.problem_2_1 = problem_2_1;
	}
	public String getResult_2_1() {
		return result_2_1;
	}
	public void setResult_2_1(String result_2_1) {
		this.result_2_1 = result_2_1;
	}
	public String getProblem_2_2() {
		return problem_2_2;
	}
	public void setProblem_2_2(String problem_2_2) {
		this.problem_2_2 = problem_2_2;
	}
	public String getResult_2_2() {
		return result_2_2;
	}
	public void setResult_2_2(String result_2_2) {
		this.result_2_2 = result_2_2;
	}
	public String getProblem_2_3() {
		return problem_2_3;
	}
	public void setProblem_2_3(String problem_2_3) {
		this.problem_2_3 = problem_2_3;
	}
	public String getResult_2_3() {
		return result_2_3;
	}
	public void setResult_2_3(String result_2_3) {
		this.result_2_3 = result_2_3;
	}
	public String getProblem_2_4() {
		return problem_2_4;
	}
	public void setProblem_2_4(String problem_2_4) {
		this.problem_2_4 = problem_2_4;
	}
	public String getResult_2_4() {
		return result_2_4;
	}
	public void setResult_2_4(String result_2_4) {
		this.result_2_4 = result_2_4;
	}
	public String getProblem_2_5() {
		return problem_2_5;
	}
	public void setProblem_2_5(String problem_2_5) {
		this.problem_2_5 = problem_2_5;
	}
	public String getResult_2_5() {
		return result_2_5;
	}
	public void setResult_2_5(String result_2_5) {
		this.result_2_5 = result_2_5;
	}
	public String getProblem_2_6() {
		return problem_2_6;
	}
	public void setProblem_2_6(String problem_2_6) {
		this.problem_2_6 = problem_2_6;
	}
	public String getResult_2_6() {
		return result_2_6;
	}
	public void setResult_2_6(String result_2_6) {
		this.result_2_6 = result_2_6;
	}
	public String getProblem_2_7() {
		return problem_2_7;
	}
	public void setProblem_2_7(String problem_2_7) {
		this.problem_2_7 = problem_2_7;
	}
	public String getResult_2_7() {
		return result_2_7;
	}
	public void setResult_2_7(String result_2_7) {
		this.result_2_7 = result_2_7;
	}
	public String getProblem_2_8() {
		return problem_2_8;
	}
	public void setProblem_2_8(String problem_2_8) {
		this.problem_2_8 = problem_2_8;
	}
	public String getResult_2_8() {
		return result_2_8;
	}
	public void setResult_2_8(String result_2_8) {
		this.result_2_8 = result_2_8;
	}
	public String getProblem_2_9() {
		return problem_2_9;
	}
	public void setProblem_2_9(String problem_2_9) {
		this.problem_2_9 = problem_2_9;
	}
	public String getResult_2_9() {
		return result_2_9;
	}
	public void setResult_2_9(String result_2_9) {
		this.result_2_9 = result_2_9;
	}
	public String getProblem_2_10() {
		return problem_2_10;
	}
	public void setProblem_2_10(String problem_2_10) {
		this.problem_2_10 = problem_2_10;
	}
	public String getResult_2_10() {
		return result_2_10;
	}
	public void setResult_2_10(String result_2_10) {
		this.result_2_10 = result_2_10;
	}
	public String getProblem_2() {
		return problem_2;
	}
	public void setProblem_2(String problem_2) {
		this.problem_2 = problem_2;
	}
	public String getChecker_2() {
		return checker_2;
	}
	public void setChecker_2(String checker_2) {
		this.checker_2 = checker_2;
	}
	public String getCheckDate_2() {
		return checkDate_2;
	}
	public void setCheckDate_2(String checkDate_2) {
		this.checkDate_2 = checkDate_2;
	}
    
	

}
