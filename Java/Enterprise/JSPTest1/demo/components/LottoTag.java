package components;

import java.io.IOException;
import java.util.Random;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class LottoTag extends SimpleTagSupport {

    private static Random rdm = new Random();
    private String digitVar;
    private int digitCount = 8;

    public void setDigitVar(String name) {
        digitVar = name;
    }

    public void setDigitCount(int value) {
        digitCount = value > 0 ? value : 8;
    }

    @Override
    public void doTag() throws JspException, IOException {
        var context = getJspContext();
        var body = getJspBody();
        for(int i = 0; i < digitCount; ++i){
            int digitVal = rdm.nextInt(10);
            context.setAttribute(digitVar, digitVal);
            body.invoke(null);
        }
    }

    
}