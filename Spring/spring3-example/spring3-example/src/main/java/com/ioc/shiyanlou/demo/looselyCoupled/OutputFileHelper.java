package com.ioc.shiyanlou.demo.looselyCoupled;

public class OutputFileHelper {

	OutputGenerator outputGenerator;
	
	public void generatorOutput(){
		this.outputGenerator.generateOutput();
	}
	
	
	public void setOutputGenerator(OutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
}
