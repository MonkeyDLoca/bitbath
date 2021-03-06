 package ojvm.loading.instructions;
                         
import ojvm.util.RuntimeConstants;

/**
 * The encapsulation of an dload_3 instruction. 
 * @author Amr Sabry
 * @version jdk-1.1
 */

public class Ins_dload_3 extends Ins_dload {

  public Ins_dload_3 (InstructionInputStream classFile) {
    super(RuntimeConstants.opc_dload_3, 3);
  }

  public String toString () {
    return opcodeName;
  }
}
