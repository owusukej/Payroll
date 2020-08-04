
package payroll;

/**
 *
 * @author Jimmy Kessie
 */
public class PayrollFactory {
	
    private static PayrollFactory instance;
    private PayrollFactory(){
        }
    public static PayrollFactory getInstance(){//adds instance into factory
        if (instance ==null){
            instance = new PayrollFactory();}
        return instance;
    }
    
}





