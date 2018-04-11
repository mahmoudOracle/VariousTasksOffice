package view.beans;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

public class TestInputValues {
    private RichInputText in2;
    private RichOutputText out1;
    private RichInputText in1;

    public TestInputValues() {
    }


    public void setIn2(RichInputText in2) {
        this.in2 = in2;
    }

    public RichInputText getIn2() {
        return in2;
    }

    public void setOut1(RichOutputText out1) {
        this.out1 = out1;
    }

    public RichOutputText getOut1() {
        return out1;
    }

    public void goAction(ActionEvent actionEvent) {
        System.out.println("Value in input 1   "+ getIn1().getValue());
        
        System.out.println("Value in input 2   "+ getIn2().getValue());
        
        System.out.println("Value in input X1   "+ getIn1().getSubmittedValue());
        
        System.out.println("Value in input X2   "+ getIn2().getSubmittedValue());
        
        System.out.println("Value in input M1   "+ getIn1().getLocalValue());
        
        System.out.println("Value in input M2   "+ getIn2().getLocalValue());

        getOut1().setValue(getIn2().getValue());
    }

    public void setIn1(RichInputText in1) {
        this.in1 = in1;
    }

    public RichInputText getIn1() {
        return in1;
    }
}
