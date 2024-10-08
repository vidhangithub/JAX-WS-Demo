package com.vidhan.calculator;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-08-08T22:44:04.883+01:00
 * Generated source version: 4.0.5
 *
 */
@WebService(targetNamespace = "http://vidhan.com/Calculator", name = "CalculatorPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CalculatorPortType {

    @WebMethod(operationName = "Add", action = "http://vidhan.com/Calculator/Add")
    @WebResult(name = "AddResponse", targetNamespace = "http://vidhan.com/Calculator", partName = "parameters")
    public AddResponse add(

        @WebParam(partName = "parameters", name = "AddRequest", targetNamespace = "http://vidhan.com/Calculator")
        AddRequest parameters
    );

    @WebMethod(operationName = "Subtract", action = "http://vidhan.com/Calculator/Subtract")
    @WebResult(name = "SubtractResponse", targetNamespace = "http://vidhan.com/Calculator", partName = "parameters")
    public SubtractResponse subtract(

        @WebParam(partName = "parameters", name = "SubtractRequest", targetNamespace = "http://vidhan.com/Calculator")
        SubtractRequest parameters
    );

    @WebMethod(operationName = "Divide", action = "http://vidhan.com/Calculator/Divide")
    @WebResult(name = "DivideResponse", targetNamespace = "http://vidhan.com/Calculator", partName = "parameters")
    public DivideResponse divide(

        @WebParam(partName = "parameters", name = "DivideRequest", targetNamespace = "http://vidhan.com/Calculator")
        DivideRequest parameters
    );

    @WebMethod(operationName = "Multiply", action = "http://vidhan.com/Calculator/Multiply")
    @WebResult(name = "MultiplyResponse", targetNamespace = "http://vidhan.com/Calculator", partName = "parameters")
    public MultiplyResponse multiply(

        @WebParam(partName = "parameters", name = "MultiplyRequest", targetNamespace = "http://vidhan.com/Calculator")
        MultiplyRequest parameters
    );
}
