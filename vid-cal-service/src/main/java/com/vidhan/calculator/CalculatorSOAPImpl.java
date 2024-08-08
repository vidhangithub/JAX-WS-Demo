package com.vidhan.calculator;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.vidhan.calculator.CalculatorPortType")
public class CalculatorSOAPImpl implements CalculatorPortType{

	@Override
	public AddResponse add(AddRequest parameters) {
		double a = parameters.getA();
		double b = parameters.getB();
		AddResponse addResponse = new AddResponse();
		addResponse.setResult(a+b);
		return addResponse;
	}

	@Override
	public SubtractResponse subtract(SubtractRequest parameters) {
		SubtractResponse subtractResponse = new SubtractResponse();
		subtractResponse.setResult(parameters.a - parameters.b);
		return subtractResponse;
	}

	@Override
	public DivideResponse divide(DivideRequest parameters) {
		DivideResponse divideResponse = new DivideResponse();
		divideResponse.setResult(parameters.a / parameters.b);
		return divideResponse;
	}

	@Override
	public MultiplyResponse multiply(MultiplyRequest parameters) {
		MultiplyResponse multiplyResponse = new MultiplyResponse();
		multiplyResponse.setResult(parameters.a * parameters.b);
		return multiplyResponse;
	}

}
