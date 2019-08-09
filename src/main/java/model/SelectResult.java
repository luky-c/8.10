package model;

import java.util.List;

public class SelectResult {
	private List<ShowModel> list;
	private Long num;
	
	public List<ShowModel> getList(){
		return this.list;
	}
	public void setList(List<ShowModel> list){
		this.list=list;
	}
	public Long getNum(){
		return this.num;
	}
	public void setNum(Long num){
		this.num = num;
	}
	public SelectResult(List<ShowModel> list , Long num){
		this.list = list;
		this.num = num;
	}
	public SelectResult(){}
}
